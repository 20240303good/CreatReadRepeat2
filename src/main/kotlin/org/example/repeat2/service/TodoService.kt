package org.example.repeat2.service

import org.example.repeat2.service.dto.CreateTodoDto
import org.example.repeat2.service.response.TodoResponse

interface TodoService {
    fun createTodo(
        createTodoDto: CreateTodoDto
    ): TodoResponse

    fun getTodo(id: Long): TodoResponse

    fun getTodos(): List<TodoResponse> //다양한 투두들을 조회할거니까 list로

    fun updateTodo()

    fun deleteTodo()
}
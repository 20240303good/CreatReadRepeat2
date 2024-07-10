package org.example.repeat2.service

import org.example.repeat2.service.dto.CreateTodoDto
import org.example.repeat2.service.response.TodoResponse

interface TodoService {
    fun createTodo(
        createTodoDto: CreateTodoDto
    ): TodoResponse

    fun getTodo(id: Long): TodoResponse

    fun getTodos()

    fun updateTodo()

    fun deleteTodo()
}
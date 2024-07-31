package org.example.repeat2.service

import org.example.repeat2.service.dto.CreateTodoDto
import org.example.repeat2.service.response.TodoResponse

interface TodoService {
    fun createTodo(
        createTodoDto: CreateTodoDto
    ): TodoResponse

    fun getTodo(id: Long): TodoResponse

    fun getTodos(): List<TodoResponse> //다양한 투두들을 조회할거니까 List로

    fun updateTodo(
        id: Long,// 어떤 todo를 수정할지 알아야함
        title: String?,//수정할 title
        description: String?,//수정할 description -> null일수도 있음
    ): TodoResponse

    fun deleteTodo(
        id: Long,
    )
}
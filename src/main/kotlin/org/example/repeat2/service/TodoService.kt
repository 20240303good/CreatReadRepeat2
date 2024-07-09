package org.example.repeat2.service

import org.example.repeat2.service.dto.CreateTodoDto
import java.io.Writer





interface TodoService {
    fun createTodo(createTodoDto : CreateTodoDto) : CreateTodoDto

    fun getTodo()

    fun updateTodo()

    fun deleteTodo()
}
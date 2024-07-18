package org.example.repeat2.controller.request

data class CreateTodoRequest(
    val title: String,
    val description: String,
    val writer: String
)
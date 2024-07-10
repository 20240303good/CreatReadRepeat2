package org.example.repeat2.controller.request

data class TodoRequest(
    val title: String,
    val description: String,
    val writer: String
)
package org.example.repeat2.controller.request

import org.springframework.context.annotation.Description

data class TodoRequest (
    val title : String,
    val description: String,
    val writer: String
)
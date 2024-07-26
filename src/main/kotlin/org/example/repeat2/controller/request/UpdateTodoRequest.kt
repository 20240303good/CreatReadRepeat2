package org.example.repeat2.controller.request

data class UpdateTodoRequest(
    val title: String?,
    val description: String?,
    //?를 붙임 -> null이 들어올경우에는 현상유지시키려는 것이다.
)
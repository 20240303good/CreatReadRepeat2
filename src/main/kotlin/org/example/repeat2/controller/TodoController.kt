package org.example.repeat2.controller

import org.example.repeat2.controller.request.TodoRequest
import org.example.repeat2.service.TodoService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/todos")
class TodoController(
    val todoService: TodoService
) {
    @PostMapping
    fun createTodo(
        @RequestBody request: TodoRequest
    ): ResponseEntity<Boolean> {
        //service에 있는 createTodo함수 호출
        //비즈니스로직을 실행시키기 위해.

        return ResponseEntity.ok(true)
    }

    @GetMapping("/{id}")
    fun getTodo(
        @PathVariable id: Long
    ): ResponseEntity<Long> {
        return ResponseEntity.status(HttpStatus.ok).body(todoId)
    }
}
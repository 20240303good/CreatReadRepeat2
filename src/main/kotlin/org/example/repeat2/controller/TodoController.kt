package org.example.repeat2.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/todos")
class TodoController {
    @PostMapping
    fun createTodo(): ResponseEntity<Boolean> {
        return ResponseEntity.ok(true)
    }
}
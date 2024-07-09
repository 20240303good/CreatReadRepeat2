package org.example.repeat2.controller


import org.example.repeat2.controller.request.TodoRequest
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/todos")
class TodoController {
    @PostMapping
    fun createTodo(
        @RequestBody request: TodoRequest
    ): ResponseEntity<Boolean> {
        return ResponseEntity.ok(true)
    }

    @GetMapping("/{id}")
    fun getTodo(
        @PathVariable id: Long
    ):ResponseEntity<Long> {
        return ResponseEntity.ok(id)
    }
}
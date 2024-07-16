package org.example.repeat2.controller

import org.example.repeat2.controller.request.TodoRequest
import org.example.repeat2.service.TodoService
import org.example.repeat2.service.response.TodoResponse
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

    @GetMapping("/{todoId}")
    fun getTodo(
        @PathVariable todoId: Long
    ): ResponseEntity<TodoResponse> {
        val result = todoService.getTodo(todoId) //컨트롤러 레이어에서 서비스레이어를 호출할때 해당결과를 변수에 담아서 리턴해주는 형태
        return ResponseEntity.status(HttpStatus.OK).body(result)
    }

    @GetMapping //벌크로 조회하기
    fun getTodos(): ResponseEntity<List<TodoResponse>> {
        //val result = todoService.getTodos()
        return ResponseEntity.status(HttpStatus.OK).body(emptyList())
    }
}
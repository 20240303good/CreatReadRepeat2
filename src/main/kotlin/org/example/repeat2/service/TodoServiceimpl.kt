package org.example.repeat2.service

import org.example.repeat2.repository.model.TodoRepository
import org.example.repeat2.repository.model.Todos
import org.example.repeat2.service.dto.CreateTodoDto
import org.example.repeat2.service.response.TodoResponse
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.getOrNull

@Service
class TodoServiceimpl(
    val todoRepository: TodoRepository
    //생성자 주입방식 -> 생성자를 통해서 주입받음
) : TodoService {
    override fun createTodo(createTodoDto: CreateTodoDto): TodoResponse {
        val todo = Todos(
            title = createTodoDto.title,
            description = createTodoDto.description,
            writer = createTodoDto.writer
        )

        val result: Todos = todoRepository.save(todo)

        return result.toResponse()
    }

    override fun getTodo(id: Long): TodoResponse {
        val todo = todoRepository.findById(id).getOrNull() ?: throw RuntimeException("해당 아이디의 todo가 존재하지 않습니다.")

        return todo.toResponse()
    }

    override fun getTodos() {
        TODO("Not yet implemented")
    }

    override fun updateTodo() {
        TODO("Not yet implemented")
    }

    override fun deleteTodo() {
        TODO("Not yet implemented")
    }
}

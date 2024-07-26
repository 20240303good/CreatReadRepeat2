package org.example.repeat2.service

import jakarta.transaction.Transactional
import org.example.repeat2.repository.model.TodoRepository
import org.example.repeat2.repository.model.Todos
import org.example.repeat2.service.dto.CreateTodoDto
import org.example.repeat2.service.response.TodoResponse
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.getOrNull

@Service
class TodoServiceimpl(
    val todoRepository: TodoRepository
    //생성자 주입방식 -> 생성자를 통해서 주입받음
) : TodoService {

    @Transactional
    override fun createTodo(createTodoDto: CreateTodoDto): TodoResponse {
        val todo = Todos(
            title = createTodoDto.title,
            description = createTodoDto.description,
            writer = createTodoDto.writer,
        )

        val result: Todos = todoRepository.save(todo)

        return result.toResponse()
    }

    override fun getTodo(id: Long): TodoResponse {
        val todo = todoRepository.findById(id).getOrNull() ?: throw RuntimeException("해당 아이디의 todo가 존재하지 않습니다.")
        // 레퍼지토리로 부터 id를 기반으로 어떻게 조회해 올것이며 , 함수는 뭘쓰는지 외우자.
        return todo.toResponse()
    }

    override fun getTodos(): List<TodoResponse> {
        val todos = todoRepository.findAll()
        //레퍼지토리에 있는 모든 데이터를 다 가져옴
        return todos.map { it.toResponse() }
        // todos에 리스트로 [todo1,todo2,todo3...]
        // map 함수는 각 요소를 바꿔줄수있다. -> 리스트의 각 요소를 toResponse로 변환해줌
    }

    @Transactional
    override fun updateTodo(id: Long, title: String?, description: String?): TodoResponse {
        val todo =
            todoRepository.findByIdOrNull(id) ?: throw java.lang.RuntimeException("해당 아이디의 todo $id 가 존재하지 않습니다.")

        // todo.title = title ?: todo.title
        // todo.description = description ?: todo.description

        todo.updateTitleOrDescription(title, description)

        return todo.toResponse()
    }

    @Transactional
    override fun deleteTodo() {
        TODO("Not yet implemented")
    }
}

fun modifyList(numbers: MutableList<Int>) {
    numbers.add(100)  // numbers 리스트에 100을 추가
}


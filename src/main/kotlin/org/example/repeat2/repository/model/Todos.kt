package org.example.repeat2.repository.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.example.repeat2.service.response.TodoResponse

@Entity(name = "Todos")
data class Todos(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    private var title: String = "",
    private var description: String = "",
    private var writer: String = "",

    ) {

    fun toResponse() = TodoResponse(
        id = id ?: throw RuntimeException("id is null"),
        title = title,
        description = description,
        writer = writer,
    )

    fun updateTitleOrDescription(title: String?, description: String?) {
        this.title = title ?: this.title
        this.description = description ?: this.description
    }
}

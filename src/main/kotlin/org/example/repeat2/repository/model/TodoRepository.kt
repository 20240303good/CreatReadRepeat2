package org.example.repeat2.repository.model

import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository : JpaRepository<Todos, Long> {

}
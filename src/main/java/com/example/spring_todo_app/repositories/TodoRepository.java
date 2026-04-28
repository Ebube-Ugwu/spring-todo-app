package com.example.spring_todo_app.repositories;

import com.example.spring_todo_app.dto.TodoDtoResponse;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_todo_app.entity.Todo;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Long> {


}

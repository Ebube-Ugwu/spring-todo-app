package com.example.spring_todo_app.service;

import com.example.spring_todo_app.dto.TodoDtoRequest;
import com.example.spring_todo_app.dto.TodoDtoResponse;

import java.util.List;

public interface TodoService {


    List<TodoDtoResponse> getAllTodos();

    TodoDtoResponse findTodo(Long id);

    TodoDtoResponse createTodo(TodoDtoRequest request);

    TodoDtoResponse updateTodo(Long id, TodoDtoRequest request);

    void destroyTodo(Long id);
}
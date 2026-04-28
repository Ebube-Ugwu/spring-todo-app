package com.example.spring_todo_app.service;

import com.example.spring_todo_app.dto.TodoDtoResponse;

import java.util.List;

public interface TodoService {


    List<TodoDtoResponse> getAllTodos();
}
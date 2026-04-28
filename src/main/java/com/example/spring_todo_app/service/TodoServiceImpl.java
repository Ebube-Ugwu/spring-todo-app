package com.example.spring_todo_app.service

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.example.spring_todo_app.dto.TodoDtoResponse;
import com.example.spring_todo_app.repositories.TodoRepository;

import lombok.RequiredArgsConstructor;

@Service
@Validated
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{
    private final TodoRepository todoRepository;

    @Override
    public List<TodoDtoResponse> getAllTodos() {
        return todoRepository.findAll();
    }
    
}
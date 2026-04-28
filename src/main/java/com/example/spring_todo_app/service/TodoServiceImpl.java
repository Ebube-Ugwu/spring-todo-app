package com.example.spring_todo_app.service;

import java.util.List;

import com.example.spring_todo_app.dto.TodoDtoRequest;
import com.example.spring_todo_app.exception.TodoNotFoundException;
import com.example.spring_todo_app.mapper.TodoMapper;
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
    private final TodoMapper todoMapper;

    @Override
    public List<TodoDtoResponse> getAllTodos() {
        return todoRepository.findAll()
                .stream()
                .map(todoMapper::toDto)
                .toList();
    }

    @Override
    public TodoDtoResponse findTodo(Long id) {
        var todo = todoRepository.findById(id)
                .orElseThrow(TodoNotFoundException::new);
        return todoMapper.toDto(todo);
    }


    @Override
    public TodoDtoResponse createTodo(TodoDtoRequest request) {
       var todo = todoMapper.toEntity(request);
       todoRepository.save(todo);
       return todoMapper.toDto(todo);
    }

    @Override
    public TodoDtoResponse updateTodo(Long id, TodoDtoRequest request) {
        var todo = todoRepository.findById(id)
                .orElseThrow(TodoNotFoundException::new);
        todoMapper.updateTodo(request, todo);
        todoRepository.save(todo);
        return todoMapper.toDto(todo);
    }

    @Override
    public void destroyTodo(Long id) {
        var todo = todoRepository.findById(id).orElseThrow(TodoNotFoundException::new);
        todoRepository.deleteById(id);
    }
}
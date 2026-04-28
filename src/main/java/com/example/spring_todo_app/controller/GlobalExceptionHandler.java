package com.example.spring_todo_app.controller;

import com.example.spring_todo_app.exception.TodoNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(TodoNotFoundException.class)
    public String handleTodoNotFoundException() {
        return "404";
    }
}

package com.example.spring_todo_app.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TodoNotFoundException extends  RuntimeException{

    public TodoNotFoundException(String message) {
        super(message);
    }
}

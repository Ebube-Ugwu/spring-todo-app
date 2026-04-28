package com.example.spring_todo_app.dto;

public record TodoDtoRequest(
    Long id,
    String name,
    String description,
    Boolean completed
) { }
    

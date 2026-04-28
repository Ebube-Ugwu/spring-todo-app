package com.example.spring_todo_app.dto;

public record TodoDtoResponse (
    Long id,
    String name,
    String description,
    Boolean completed
){ }

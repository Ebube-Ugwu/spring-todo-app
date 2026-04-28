package com.example.spring_todo_app.dto;

import jakarta.validation.constraints.NotBlank;

public record TodoDtoRequest(
    @NotBlank
    String name,
    String description,
    Boolean completed
) { }
    

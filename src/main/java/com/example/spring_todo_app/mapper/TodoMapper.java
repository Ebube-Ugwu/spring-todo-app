package com.example.spring_todo_app.mapper;

import com.example.spring_todo_app.dto.TodoDtoRequest;
import com.example.spring_todo_app.dto.TodoDtoResponse;
import com.example.spring_todo_app.entity.Todo;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface TodoMapper {
    TodoDtoResponse toDto(Todo entity);
    Todo toEntity(TodoDtoRequest dto);
    void updateTodo(TodoDtoRequest dto, @MappingTarget Todo entity);
}

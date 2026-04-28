package com.example.spring_todo_app.controller;

import com.example.spring_todo_app.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class TodoController {
   private  final TodoService todoService;

    @GetMapping("/")
    public String home(Model model) {
        var todos = todoService.getAllTodos();
        model.addAttribute("todos", todos);
        return "index";
    }
}

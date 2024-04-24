package com.dgmf.service.impl;

import com.dgmf.entity.Todo;
import com.dgmf.service.TodoService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(
                Todo.builder()
                    .id(1L)
                    .username("johnDoe")
                    .description("Learn AWS")
                    .targetDate(LocalDate.now().plusYears(1))
                    .done(false)
                    .build()
        );
        todos.add(
                Todo.builder()
                    .id(1L)
                    .username("johnDoe")
                    .description("Learn DevOps")
                    .targetDate(LocalDate.now().plusYears(2))
                    .done(false)
                    .build()
        );
        todos.add(
                Todo.builder()
                    .id(1L)
                    .username("johnDoe")
                    .description("Learn Full Stack Development")
                    .targetDate(LocalDate.now().plusYears(3))
                    .done(false)
                    .build()
        );
    }

    @Override
    public List<Todo> getTodoByUsername(String username) {
        return todos;
    }
}

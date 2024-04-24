package com.dgmf.service;

import com.dgmf.entity.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getTodoByUsername(String username);
}

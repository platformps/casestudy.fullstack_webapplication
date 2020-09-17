package com.github.curriculeon.service;


import com.github.curriculeon.model.Todo;
import com.github.curriculeon.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService implements ITodoService {

    @Autowired
    private TodoRepository repository;

    @Override
    public List<Todo> getTodoByUser(String user){
        return repository.findByUserName(user);
    }

    @Override
    public Optional<Todo> getTodoById(long id){
        return repository.findById(id);
    }

    @Override
    public void updateTodo(Todo todo){
        repository.save(todo);
    }

    @Override
    public void addTodo(String name, String desc, Date targetDate, boolean isDone){
        repository.save(new Todo(name, desc, targetDate, isDone));
    }

    @Override
    public void deleteTodo(long id){
        Optional<Todo> todo = repository.findById(id);
        if (todo.isPresent()){
            repository.delete(todo.get());
        }
    }

    @Override
    public void saveTodo(Todo todo){
        repository.save(todo);
    }

}

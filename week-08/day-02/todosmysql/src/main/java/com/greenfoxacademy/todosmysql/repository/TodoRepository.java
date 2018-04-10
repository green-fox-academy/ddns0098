package com.greenfoxacademy.todosmysql.repository;

import com.greenfoxacademy.todosmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}

package com.greenfoxacademy.todosmysql.repository;

import com.greenfoxacademy.todosmysql.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

  List<Todo> findAllByDone(boolean done);
}

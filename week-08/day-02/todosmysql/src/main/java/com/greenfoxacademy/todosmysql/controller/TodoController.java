package com.greenfoxacademy.todosmysql.controller;

import com.greenfoxacademy.todosmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value = {"/","/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
    if (isActive) {
      model.addAttribute("todos", todoRepository.findByDone(isActive));
    } else {
      model.addAttribute("todos", todoRepository.findAll());
    }
    return "todoslist";
  }

}

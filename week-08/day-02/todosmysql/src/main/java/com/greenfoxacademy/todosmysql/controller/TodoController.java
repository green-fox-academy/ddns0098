package com.greenfoxacademy.todosmysql.controller;

import com.greenfoxacademy.todosmysql.model.Todo;
import com.greenfoxacademy.todosmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/add")
  public String add() {
    return "add";
  }

  @PostMapping("/add")
  public String add(@ModelAttribute(name = "title") String title) {
    if (!title.equals("") && title != null) {
      todoRepository.save(new Todo(title));
    }
    return "redirect:/todo/";
  }

}

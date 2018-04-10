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
  public String list(Model model, @RequestParam(value = "isActive", required = false, defaultValue = "true") boolean isActive) {
    if (!isActive) {
      model.addAttribute("todos", todoRepository.findAllByDone(isActive));
      return "todoslist";
    }
      model.addAttribute("todos", todoRepository.findAll());
    return "todoslist";
  }

  @GetMapping("/add")
  public String add() {
    return "add";
  }

  @PostMapping("/add")
  public String add(@ModelAttribute(name = "title") String title) {
    todoRepository.save(new Todo(title));
    return "redirect:/todo/";
  }

  @RequestMapping("/{id}/delete")
  public String  delete(@PathVariable long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/edit")
  public String edit(Model model, @PathVariable long id) {
    model.addAttribute("todo", todoRepository.findById(id).get());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@ModelAttribute(name = "todo") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/";
  }
}

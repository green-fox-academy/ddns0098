package com.greenfoxacademy.todos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @RequestMapping(value = {"/","/list"})
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }

}
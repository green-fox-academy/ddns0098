package com.greenfoxacademy.di.controllers;

import com.greenfoxacademy.di.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreenFoxController {
  @Autowired
  StudentService studentService;

  @RequestMapping("/gfa")
  public String greenFoxMain() {
    return "gfa";
  }

  @RequestMapping("/gfa/list")
  public String listStudents(Model model) {
    model.addAttribute("names", studentService.findAll());
    return "list";
  }

  @RequestMapping("/gfa/add")
  public String addStudent() {
    return "add";
  }

  @RequestMapping("/gfa/save")
  public String saveStudent(@ModelAttribute(name = "name") String name) {
    studentService.save(name);
    return "redirect:/gfa";
  }
}

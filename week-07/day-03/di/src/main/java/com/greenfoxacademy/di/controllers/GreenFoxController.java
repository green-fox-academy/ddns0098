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
  public String greenFoxMain(Model model) {
    model.addAttribute("count", studentService.count());
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

  @RequestMapping("/gfa/check")
  public String checkStudent() {
    return "check";
  }

  @RequestMapping("/gfa/checked")
  public String checkStudent(Model model, @ModelAttribute(name = "name") String name) {
    model.addAttribute("isInList", studentService.isInList(name));
    model.addAttribute("name", name);
    return "checked";
  }
}

package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  private AtomicLong count = new AtomicLong();

  @RequestMapping(value = "/web/greeting", produces = "text/plain;charset=UTF-8")
  public String greeting(Model model, @RequestParam("name") String name) {
    model.addAttribute("name", name);
    count.getAndIncrement();
    model.addAttribute("count", count);
    return "greeting";
  }
}

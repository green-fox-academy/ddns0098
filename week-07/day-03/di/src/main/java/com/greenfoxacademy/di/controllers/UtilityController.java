package com.greenfoxacademy.di.controllers;

import com.greenfoxacademy.di.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UtilityController {

  @Autowired
  UtilityService utilityService;

  @RequestMapping("/useful")
  public String mainPage() {
    return "index";
  }

  @RequestMapping("/useful/colored")
  public String coloredPage(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }
}

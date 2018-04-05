package com.greenfoxacademy.di.controllers;

import com.greenfoxacademy.di.UtilityService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

  @RequestMapping(value = "/useful/email")
  public String emailPage(Model model, @RequestParam("email") String email) {
    if (utilityService.validateEmail(email)) {
      model.addAttribute("text",  email + " is a valid email address");
      model.addAttribute("color", "green");
    } else {
      model.addAttribute("text",  email + " is not a valid email address");
      model.addAttribute("color", "red");
    }
    return "validate";
  }

  @RequestMapping("/useful/caesar")
  public String caesarCode(Model model, @RequestParam("text") String text, @RequestParam("number") int number) {
    model.addAttribute("text", utilityService.caesar(text, number));
    return "caesar";
  }
}

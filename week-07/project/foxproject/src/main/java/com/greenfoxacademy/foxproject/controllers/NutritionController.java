package com.greenfoxacademy.foxproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NutritionController {

  @GetMapping("/nutritionStore")
  public String nutrition() {
    return "nutrition";
  }
}

package com.greenfoxacademy.foxproject.controllers;

import com.greenfoxacademy.foxproject.services.PetService;
import com.greenfoxacademy.foxproject.temp.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

  private PetService petService;

  @Autowired
  public MainController(PetService petService) {
    this.petService = petService;
  }

  @GetMapping("/")
  public String mainPage(Model model) {
    if (Util.loggedInPet == null) {
      return "redirect:/login";
    } else {
      model.addAttribute("pet", Util.loggedInPet);
      return "index";
    }
  }
}

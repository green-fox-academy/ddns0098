package com.greenfoxacademy.foxproject.controllers;

import com.greenfoxacademy.foxproject.models.Pet;
import com.greenfoxacademy.foxproject.services.PetService;
import com.greenfoxacademy.foxproject.temp.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

  private PetService petService;

  @Autowired
  public LoginController(PetService petService) {
    this.petService = petService;
  }

  @GetMapping("/login")
  public String loginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@ModelAttribute(name = "petname") String petname, Model model) {
    Pet pet = petService.login(petname);
    if (pet != null) {
      Util.loggedInPet = pet;
      return "redirect:/";
    } else {
      return "redirect:/login";
    }
  }
}

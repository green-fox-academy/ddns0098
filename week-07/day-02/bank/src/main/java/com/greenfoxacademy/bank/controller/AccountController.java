package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

  @GetMapping("/show")
  public String showAccount(Model model) {
    BankAccount account = new  BankAccount("Simba", 2000, "lion");
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("animal", account.getAnimalType());
    return "show";
  }
}

package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DecimalFormat;
import java.text.NumberFormat;

@Controller
public class AccountController {
  private String currency = "Zebra";

  @GetMapping("/show")
  public String showAccount(Model model) {
    NumberFormat formatter = new DecimalFormat("#0.00");
    BankAccount account = new  BankAccount("Simba", 2000, "lion");
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", formatter.format(account.getBalance()));
    model.addAttribute("currency", currency);
    model.addAttribute("animal", account.getAnimalType());
    return "show";
  }
}

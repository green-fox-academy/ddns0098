package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class AccountController {

  private List<BankAccount> accounts = new ArrayList<>(Arrays.asList(
          new BankAccount("Simba", "2000", "lion", true, false),
    new BankAccount("Zordon", "500", "lion", false, true),
    new BankAccount("Rafiki", "1000", "monkey", false, false),
    new BankAccount("Zazu", "200", "bird", false, false)
  ));

  @GetMapping("/show")
  public String showAccount(Model model) {
    BankAccount account = new  BankAccount("Simba", "2000", "lion", true, true);
    getAccountDetailsAndPassThem(model, account);
    return "show";
  }

  @GetMapping("/showaccounts")
  public String showAccounts(Model model) {
    model.addAttribute("accounts", accounts);
    return "accounts";
  }

  @GetMapping(value = "/showaccounts", params = "raise")
  public String raise(HttpServletRequest request) {
    Integer index = Integer.valueOf(request.getParameter("raise"));
    accounts.get(index).raise(index);
    return "redirect:showaccounts";
  }

  private void getAccountDetailsAndPassThem(Model model, BankAccount account) {
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("animal", account.getAnimalType());
  }
}

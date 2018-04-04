package com.greenfoxacademy.bank.controller;

import com.greenfoxacademy.bank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {
  private String currency = "Zebra";
  private List<BankAccount> accounts = new ArrayList<>();

  @GetMapping("/show")
  public String showAccount(Model model) {
    BankAccount account = new  BankAccount("Simba", "2000", "lion");
    formatBalance(account);
    getAccountDetailsAndPassThem(model, account);
    return "show";
  }

  @GetMapping("/showaccounts")
  public String showAccounts(Model model) {
    fillAccounts();
    model.addAttribute("accounts", accounts);
    return "accounts";
  }

  private void fillAccounts() {
    accounts.add(new BankAccount("Simba", "2000", "lion"));
    accounts.add(new BankAccount("Zordon", "500", "lion"));
    accounts.add(new BankAccount("Rafiki", "1000", "monkey"));
    accounts.add(new BankAccount("Zazu", "200", "bird"));

    for (int i = 0; i < accounts.size(); i++) {
      formatBalance(accounts.get(i));
    }
  }

  private void getAccountDetailsAndPassThem(Model model, BankAccount account) {
    model.addAttribute("name", account.getName());
    model.addAttribute("balance", account.getBalance());
    model.addAttribute("animal", account.getAnimalType());
  }

  private void formatBalance(BankAccount account) {
    String newBalance = String.format(account.getBalance() + ".00 " + currency);
    account.setBalance(newBalance);
  }
}

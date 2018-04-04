package com.greenfoxacademy.bank.model;

public class BankAccount {
  private String name;
  private String balance;
  private String animalType;
  private boolean isKing;
  private boolean isBad;
  private String currency = "Zebra";

  public BankAccount(String name, String balance, String animalType, boolean isKing, boolean isBad) {
    this.name = name;
    this.balance = balance + ".00 " + currency;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isBad = isBad;
  }

  public BankAccount() {
  }

  public boolean isBad() {
    return isBad;
  }

  public boolean isKing() {
    return isKing;
  }

  public String getName() {
    return name;
  }

  public String getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void raise() {
    if (isKing) {
      balance = String.valueOf(Double.valueOf(balance.split(" ")[0]) + 100);
    } else {
      balance = String.valueOf(Double.valueOf(balance.split(" ")[0]) + 10);
    }
  }
}

package com.greenfoxacademy.bank.model;

public class BankAccount {
  private String name;
  private String balance;
  private String animalType;
  private boolean isKing;
  private boolean isBad;
  private String currency = "Zebra";
  private int index;

  public BankAccount(String name, String balance, String animalType, boolean isKing, boolean isBad) {
    this.name = name;
    this.balance = balance + ".00 " + currency;
    this.animalType = animalType;
    this.isKing = isKing;
    this.isBad = isBad;
  }

  public BankAccount() {
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
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

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public void raise(int index) {
    if (this.index == index) {
      if (isKing()) {
        balance = String.valueOf(Double.valueOf(balance.split(" ")[0]) + 100) + "0 " + currency;
      } else {
        balance = String.valueOf(Double.valueOf(balance.split(" ")[0]) + 10) + "0 " + currency;
      }
    }
  }
}

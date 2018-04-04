package com.greenfoxacademy.bank.model;

public class BankAccount {
  private String name;
  private String balance;
  private String animalType;
  private boolean isKing;
  private boolean isBad;

  public BankAccount(String name, String balance, String animalType, boolean isKing, boolean isBad) {
    this.name = name;
    this.balance = balance;
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

  public void setKing(boolean king) {
    isKing = king;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }
}

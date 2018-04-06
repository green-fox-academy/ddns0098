package com.greenfoxacademy.foxproject.models;

import java.util.ArrayList;
import java.util.List;

public class Pet {

  private String name;
  private List<String> tricks = new ArrayList<>();
  private String food = "bread";
  private String drink = "water";

  public Pet(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }



  public int countTricks() {
    return tricks.size();
  }
}

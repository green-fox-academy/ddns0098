package com.greenfoxacademy.di;

import org.springframework.stereotype.Component;

@Component
public class BlueColor implements MyColor {
  @Override
  public String printColor() {
    return "Blue";
  }
}

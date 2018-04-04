package com.greenfoxacademy.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CeptionController {
  @GetMapping("/ception")
  public String ception() {
    return "ception";
  }
}

package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
          "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
          "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
          "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

  private static Random random = new Random();
  private AtomicLong count = new AtomicLong();
  private static int size;
  private static int r;
  private static int g;
  private static int b;

  @RequestMapping(value = "/web/greeting", produces = "text/plain;charset=UTF-8")
  public String greeting(Model model, @RequestParam("name") String name) {
    model.addAttribute("name", name);
    count.getAndIncrement();
    model.addAttribute("count", count);
    return "greeting";
  }

  @RequestMapping("/web/hello")
  public String hello(Model model, @RequestParam("name") String name) {
    model.addAttribute("hellos", hellos);
    model.addAttribute("name", name);
    model.addAttribute("size", size);
    model.addAttribute("r", r);
    model.addAttribute("g", g);
    model.addAttribute("b", b);
    return "hello";
  }

  public static void generateRandoms() {
    size = random.nextInt(100)+ 20;
    r = random.nextInt(255) + 1;
    g = random.nextInt(255) + 1;
    b = random.nextInt(255) + 1;
  }
}

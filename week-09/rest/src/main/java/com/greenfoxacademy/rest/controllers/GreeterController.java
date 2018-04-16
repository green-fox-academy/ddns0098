package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.Greet;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @RequestMapping("/greeter")
    public Greet greet(@RequestParam(name = "name", required = false) String name, @RequestParam(name = "title", required = false) String title) {
        if (name != null && title != null) {
            return new Greet(name, title);
        } else if (title == null && name != null) {
            return new Greet("Please provide a title!");
        }
        return new Greet();
    }
}

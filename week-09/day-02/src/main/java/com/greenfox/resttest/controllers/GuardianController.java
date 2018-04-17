package com.greenfox.resttest.controllers;


import com.greenfox.resttest.models.Groot;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @RequestMapping("/groot")
    public Groot groot(@RequestParam String message) {
        if (message != null) {
            return new Groot(message);
        }

        return new Groot();
    }
}

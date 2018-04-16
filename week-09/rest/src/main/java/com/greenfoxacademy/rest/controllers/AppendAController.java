package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.Appended;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendAController {

    @RequestMapping("/appenda/{appendable}")
    public Appended append(@PathVariable String appendable) {
        return new Appended(appendable);
    }
}

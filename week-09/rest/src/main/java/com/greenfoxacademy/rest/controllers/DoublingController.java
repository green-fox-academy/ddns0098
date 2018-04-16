package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.DoubleModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingController {

    @RequestMapping("/doubling")
    public DoubleModel doubling(@RequestParam(name = "input", required = false) Integer input) {
        if (input != null) {
            return new DoubleModel(input);
        }
        return new DoubleModel();
    }

}

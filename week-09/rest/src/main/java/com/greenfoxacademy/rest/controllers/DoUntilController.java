package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.DoUntil;
import com.greenfoxacademy.rest.services.DoUntilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilController {

    @Autowired
    DoUntilService doUntilService;

    @RequestMapping(value = "/dountil/{what}", method = RequestMethod.POST)
    public DoUntil doUntil(@PathVariable String what,@RequestBody(required = false) DoUntil until) {
        if (until == null) {
            return new DoUntil();
        } else if (what.equals("sum")) {
            System.out.println("sum");
            return doUntilService.sum(until.getUntil());
        } else if (what.equals("factor")) {
            System.out.println("factor");
            return doUntilService.factor(until.getUntil());
        }
        return null;
    }
}

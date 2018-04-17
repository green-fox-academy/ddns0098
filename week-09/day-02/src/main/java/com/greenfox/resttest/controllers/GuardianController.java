package com.greenfox.resttest.controllers;


import com.greenfox.resttest.models.Groot;
import com.greenfox.resttest.models.Yondu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class GuardianController {

    @RequestMapping("/groot")
    public Groot groot(@RequestParam(required = false) String message, HttpServletResponse response) {
        if (message != null) {
            return new Groot(message);
        }
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
        return new Groot();
    }

    @RequestMapping("/yondu")
    public Yondu yondu(@RequestParam(required = false) Double distance, @RequestParam(required = false) Double time,  HttpServletResponse response) {
        if (distance == null) {
            response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            return new Yondu("Please provide a distance!");
        } else if (time == null) {
            response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            return new Yondu("Please provide a time!");
        } else {
            return new Yondu(distance,time);
        }
    }
}

package com.greenfox.resttest.controllers;


import com.greenfox.resttest.models.Groot;
import com.greenfox.resttest.models.Yondu;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @RequestMapping("/groot")
    public ResponseEntity groot(@RequestParam(required = false) String message) {
        if (message != null) {
            return ResponseEntity.status(HttpStatus.OK).body(new Groot(message));

        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Groot());
    }

    @RequestMapping("/yondu")
    public ResponseEntity yondu(@RequestParam(required = false) Double distance, @RequestParam(required = false) Double time) {
        if (distance == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Yondu("Please provide a distance!"));
        } else if (time == null) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Yondu("Please provide a time!"));
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(new Yondu(distance,time));
        }
    }
}

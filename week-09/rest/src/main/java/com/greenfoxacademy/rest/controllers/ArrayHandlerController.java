package com.greenfoxacademy.rest.controllers;

import com.greenfoxacademy.rest.models.ArrayHandler;
import com.greenfoxacademy.rest.services.ArrayHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayHandlerController {

    @Autowired
    ArrayHandlerService arrayHandlerService;

    @RequestMapping(value = "/arrays", method = RequestMethod.POST)
    public ArrayHandler arrayHandler(@RequestBody(required = false) ArrayHandler handler) {
        if (handler.getWhat() == null) {
            handler.setError("Please provide what to do with the numbers!");
            return handler;
        } else if (handler.getNumbers() == null) {
            handler.setError("Please provide numbers!");
            return handler;
        } else if (handler.getWhat().equals("sum")) {
            return arrayHandlerService.sum(handler);
        } else if (handler.getWhat().equals("multiply")) {
            return arrayHandlerService.multiply(handler);
        } else if (handler.getWhat().equals("double")) {
            arrayHandlerService.doubleMethod(handler);
            return handler;
        }
        return null;
    }
}

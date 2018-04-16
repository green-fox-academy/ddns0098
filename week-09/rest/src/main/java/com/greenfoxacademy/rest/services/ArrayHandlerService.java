package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.ArrayHandler;
import org.springframework.stereotype.Component;

@Component
public class ArrayHandlerService {

    public ArrayHandler sum(ArrayHandler handler) {
        for (int i = 0; i < handler.getNumbers().length; i++) {
            handler.setResult(handler.getResult() + handler.getNumbers()[i]);
        }
        return handler;
    }

    public ArrayHandler multiply(ArrayHandler handler) {
        handler.setResult(1);
        for (int i = 0; i < handler.getNumbers().length; i++) {
            handler.setResult(handler.getResult() * handler.getNumbers()[i]);
        }
        return handler;
    }

    public void doubleMethod(ArrayHandler handler) {
        for (int i = 0; i < handler.getNumbers().length; i++) {
            handler.getNumbers()[i] *= 2;
        }
    }
}

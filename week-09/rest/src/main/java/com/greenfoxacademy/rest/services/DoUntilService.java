package com.greenfoxacademy.rest.services;

import com.greenfoxacademy.rest.models.DoUntil;
import org.springframework.stereotype.Component;

@Component
public class DoUntilService {

    public DoUntil sum(DoUntil doUntil) {
        doUntil.setResult(0);
        for (int i = 0; i < doUntil.getUntil(); i++) {
            doUntil.setResult(doUntil.getResult() + i + 1);
        }
        return doUntil;
    }

    public DoUntil factor(DoUntil doUntil) {
        doUntil.setResult(1);
        for (int i = 0; i < doUntil.getUntil(); i++) {
            doUntil.setResult(doUntil.getResult() * (i+1));
        }
        return doUntil;
    }
}

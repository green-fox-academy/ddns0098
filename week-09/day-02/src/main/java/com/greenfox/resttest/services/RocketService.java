package com.greenfox.resttest.services;

import com.greenfox.resttest.models.Rocket;
import org.springframework.stereotype.Component;

@Component
public class RocketService {

    public void fill(Rocket rocket, String caliber, int amount) {
        if (caliber.equals(".25")) {
            rocket.setCaliber25(amount);
        } else if (caliber.equals(".30")) {
            rocket.setCaliber30(amount);
        } else if (caliber.equals(".50")) {
            rocket.setCaliber50(amount);
        }
    }

    public void status(Rocket rocket) {
        double temp = rocket.getCaliber25() + rocket.getCaliber30() + rocket.getCaliber50();
        if (temp > 12500) {
            rocket.setShipstatus("overloaded");
        } else if (temp == 12500) {
            rocket.setShipstatus("full");
            rocket.setReady(true);
        } else if (temp > 0) {
            rocket.setShipstatus(String.valueOf((int)(temp / 12500 * 100)) + "%");
        } else {
            rocket.setShipstatus("empty");
        }
    }
}

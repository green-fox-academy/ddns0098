package com.greenfox.resttest.models;

public class Yondu {
    private Double distance = null;
    private Double time = null;
    private Double speed = null;
    private String error = null;

    public Yondu(Double distance, Double time) {
        this.distance = distance;
        this.time = time;
        speed = distance / time;
    }

    public Yondu(String error) {
        this.error = error;
    }

    public Yondu() {
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getTime() {
        return time;
    }

    public void setTime(Double time) {
        this.time = time;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

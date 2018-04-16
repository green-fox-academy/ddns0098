package com.greenfoxacademy.rest.models;

public class DoUntil {
    private String error;
    private Integer until;
    private Integer result;

    public DoUntil(Integer until) {
        this.until = until;
    }

    public DoUntil() {
        error = "Please provide a number!";
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}

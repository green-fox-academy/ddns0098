package com.greenfoxacademy.rest.models;

public class DoubleModel {
    private Integer received = null;
    private Integer result = null;
    private String error = null;

    public DoubleModel(Integer received) {
        this.received = received;
        result = received * 2;
    }

    public DoubleModel() {
        error = "Please provide an input!";
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

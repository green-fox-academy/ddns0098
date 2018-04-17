package com.greenfox.resttest.models;

public class Groot {
    private String received = null;
    private String translated = null;
    private String error = null;

    public Groot() {
        error = "I am Groot!";
    }

    public Groot(String received) {
        this.received = received;
        translated = "I am Groot!";
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

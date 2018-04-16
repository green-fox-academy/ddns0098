package com.greenfoxacademy.rest.models;

public class Greet {

    private String name = null;
    private String title = null;
    private String welcome_message = null;
    private String error = null;

    public Greet(String name, String title) {
        this.name = name;
        this.title = title;
        welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }

    public Greet(String error) {
        this.error = error;
    }

    public Greet() {
        error = "Please provide a name!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

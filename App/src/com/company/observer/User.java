package com.company.observer;

public class User {

    private String name;
    private String email;
    private int state;


    public User() {
    }

    public User(String name, String email, int state) {
        this.name = name;
        this.email = email;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}

package com.kodilla.challenges.allegro.user;

public class User {
    private String name;
    private String address;
    private String mail;

    public User(String name, String adres, String mail) {
        this.name = name;
        this.address = adres;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }
}


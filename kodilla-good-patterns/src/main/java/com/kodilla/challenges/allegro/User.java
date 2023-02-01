package com.kodilla.challenges.allegro;

public class User {
    private String name;
    private String adres;
    private String mail;

    public User(String name, String adres, String mail) {
        this.name = name;
        this.adres = adres;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getAdres() {
        return adres;
    }

    public String getMail() {
        return mail;
    }
}


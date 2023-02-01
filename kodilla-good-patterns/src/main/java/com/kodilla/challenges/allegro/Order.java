package com.kodilla.challenges.allegro;

public class Order {
    public Product product;
    public User user;

    public Order(User user, Product product) {
        this.product = product;
        this.user = user;
    }
}

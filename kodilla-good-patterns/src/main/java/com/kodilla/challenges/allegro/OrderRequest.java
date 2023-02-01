package com.kodilla.challenges.allegro;

public class OrderRequest {

    private User user;
    private Product product;

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public OrderRequest(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}

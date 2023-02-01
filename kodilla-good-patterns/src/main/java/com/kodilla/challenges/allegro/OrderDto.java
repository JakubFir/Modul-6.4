package com.kodilla.challenges.allegro;

public class OrderDto {
    private User user;
    private boolean isProductAvailable;

    private Product product;

    public OrderDto(User user, boolean isProductAvailable, Product product) {
        this.user = user;
        this.product = product;
        this.isProductAvailable = isProductAvailable;
    }

    public User getUser() {
        return user;
    }

    public boolean isProductAvailable() {
        return isProductAvailable;
    }
}

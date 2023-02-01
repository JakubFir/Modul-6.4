package com.kodilla.challenges.allegro;

public class OrderDto {
    private User user;
    private boolean isProductAvaible;

    public OrderDto(User user, boolean isProductAvailble, Product product) {
        this.user = user;
        this.isProductAvaible = isProductAvailble;
    }

    public User getUser() {
        return user;
    }

    public boolean isProductAvaible() {
        return isProductAvaible;
    }
}

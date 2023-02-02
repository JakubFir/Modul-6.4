package com.kodilla.challenges.allegro.order;

import com.kodilla.challenges.allegro.product.Product;
import com.kodilla.challenges.allegro.user.User;

public class AllegroOrderRequest {

    private User user;
    private Product product;

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public AllegroOrderRequest(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}

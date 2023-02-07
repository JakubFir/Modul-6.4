package com.kodilla.challenges.allegro.order;

import com.kodilla.challenges.allegro.product.Product;
import com.kodilla.challenges.allegro.user.User;

public class Order {
    public Product product;
    public User user;

    public Order(User user, Product product) {
        this.product = product;
        this.user = user;
    }

}

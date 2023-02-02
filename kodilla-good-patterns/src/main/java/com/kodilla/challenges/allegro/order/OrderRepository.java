package com.kodilla.challenges.allegro.order;

import com.kodilla.challenges.allegro.product.Product;
import com.kodilla.challenges.allegro.user.User;

import java.util.List;

public interface OrderRepository {

    List<Product> products();
    List<Order> addOrder(User user, Product product);
    void createOrder(User user, Product product);
}

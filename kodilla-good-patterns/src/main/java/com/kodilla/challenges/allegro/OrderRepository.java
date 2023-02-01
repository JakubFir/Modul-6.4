package com.kodilla.challenges.allegro;

import java.util.List;

public interface OrderRepository {

    List<Product> products();
    List<Order> addOrder(User user,Product product);
    void createOrder(User user, Product product);
}

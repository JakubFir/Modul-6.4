package com.kodilla.challenges.allegro;

import java.util.ArrayList;
import java.util.List;

public class AllegroOrderRepository implements OrderRepository {
    @Override
    public List<Product> products() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("shoes"));
        return products;
    }

    @Override
    public void createOrder(User user, Product product) {
        System.out.println("creating order");
        addOrder(user, product);
    }

    @Override
    public List<Order> addOrder(User user, Product product) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order(user, product));
        System.out.println("adding order");
        return orders;
    }
}

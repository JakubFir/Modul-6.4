package com.kodilla.challenges.allegro;

import java.util.List;

public interface OrderRepository {

    List<Product> products();
    void createOrder(User user, Product product);


}

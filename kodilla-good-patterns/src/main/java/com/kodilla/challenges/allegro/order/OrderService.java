package com.kodilla.challenges.allegro.order;

import com.kodilla.challenges.allegro.product.Product;
import com.kodilla.challenges.allegro.user.User;

public interface OrderService {
    void order(User user, Product product);

}

package com.kodilla.challenges.allegro.order;

import com.kodilla.challenges.allegro.product.Product;
import com.kodilla.challenges.allegro.user.User;

public class AllegroOrderService implements OrderService {
    private OrderRepository orderRepository;

    @Override
    public void order(User user, Product product) {
        orderRepository.products().add(product);
    }
}

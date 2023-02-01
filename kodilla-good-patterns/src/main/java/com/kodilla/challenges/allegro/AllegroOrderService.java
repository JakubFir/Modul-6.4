package com.kodilla.challenges.allegro;

public class AllegroOrderService implements OrderService {
    private OrderRepository orderRepository;

    @Override
    public void order(User user, Product product) {
        orderRepository.products().add(product);
    }
}

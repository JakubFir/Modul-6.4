package com.kodilla.challenges.allegro;

public class OrderProcessor {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {

        boolean isProductAvailable = orderRepository.products().contains(orderRequest.getProduct());

        if(isProductAvailable) {
            informationService.inform(orderRequest.getUser().getMail());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), isProductAvailable,orderRequest.getProduct());
        } else {
            return new OrderDto(orderRequest.getUser(), isProductAvailable,orderRequest.getProduct());
        }
    }
}

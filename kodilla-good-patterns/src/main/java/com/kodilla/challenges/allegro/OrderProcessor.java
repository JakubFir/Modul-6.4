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
        if (isProductAvailable) {
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            informationService.sendEmail(orderRequest.getUser().getMail());
            return new OrderDto(orderRequest.getUser(), isProductAvailable, orderRequest.getProduct());
        } else {
            System.out.println("xd");
            return new OrderDto(orderRequest.getUser(), isProductAvailable, orderRequest.getProduct());
        }
    }
}

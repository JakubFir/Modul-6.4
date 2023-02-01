package com.kodilla.challenges.allegro;

public class Aplication {
    public static void main(String[] args) {

        OrderRequestRetrevier orderRequestRetrevier = new OrderRequestRetrevier();
        OrderRequest orderRequest = orderRequestRetrevier.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new AllegroInformationService(), new AllegroOrderService(), new AllegroOrderRepository());

        orderProcessor.process(orderRequest);

    }
}

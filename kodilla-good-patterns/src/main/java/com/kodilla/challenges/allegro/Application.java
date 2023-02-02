package com.kodilla.challenges.allegro;

import com.kodilla.challenges.allegro.information.AllegroInformationService;
import com.kodilla.challenges.allegro.order.*;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetrevier orderRequestRetrevier = new OrderRequestRetrevier();
        AllegroOrderRequest orderRequest = orderRequestRetrevier.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(new AllegroInformationService(), new AllegroOrderService(), new AllegroOrderRepository());

        orderProcessor.process(orderRequest);

    }
}

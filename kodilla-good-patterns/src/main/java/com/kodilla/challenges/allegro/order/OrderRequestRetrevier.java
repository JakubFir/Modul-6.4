package com.kodilla.challenges.allegro.order;

import com.kodilla.challenges.allegro.product.Product;
import com.kodilla.challenges.allegro.user.User;

public class OrderRequestRetrevier {

    private AllegroOrderRepository allegroOrderRepository = new AllegroOrderRepository();
    public AllegroOrderRequest retrieve(){
        User user = new User("asd","asd","asd");
        Product product = new Product("shoes");
        return new AllegroOrderRequest(user,product);

    }
}

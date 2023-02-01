package com.kodilla.challenges.allegro;

public class OrderRequestRetrevier {

    private AllegroOrderRepository allegroOrderRepository = new AllegroOrderRepository();
    public OrderRequest retrieve(){
        User user = new User("asd","asd","asd");
        Product product = new Product("shoes");
        return new OrderRequest(user,product);

    }
}

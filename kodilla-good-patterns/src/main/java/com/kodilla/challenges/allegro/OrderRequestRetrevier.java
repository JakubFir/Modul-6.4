package com.kodilla.challenges.allegro;

public class OrderRequestRetrevier {

    public OrderRequest retrieve(){
        User user = new User("asd","asd","asd");
        Product product = new Product();

        return new OrderRequest(user,product);
    }
}

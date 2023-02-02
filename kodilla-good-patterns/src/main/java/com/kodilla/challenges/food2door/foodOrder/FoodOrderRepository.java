package com.kodilla.challenges.food2door.foodOrder;

import com.kodilla.challenges.allegro.order.Order;
import com.kodilla.challenges.food2door.supplier.Supplier;

import java.util.List;
import java.util.Map;

public interface FoodOrderRepository {
    Map<Supplier, FoodOrder> listOfOrders();
    void addNewOrder(FoodOrder order, Supplier supplier,int amount);

}

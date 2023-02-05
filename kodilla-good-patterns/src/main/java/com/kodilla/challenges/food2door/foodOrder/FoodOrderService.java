package com.kodilla.challenges.food2door.foodOrder;

import com.kodilla.challenges.food2door.foodOrder.supplier.Supplier;

import java.util.HashMap;
import java.util.Map;

public class FoodOrderService implements FoodOrderRepository {
    @Override
    public Map<Supplier, FoodOrder> listOfOrders() {
        Map<Supplier, FoodOrder> orders = new HashMap<>();

        return orders;
    }

    @Override
    public void addNewOrder(FoodOrder order, Supplier supplier, int amount) {
        System.out.println("supplier is: " + supplier.getSupplierName());
        System.out.println("order for: " + order.getProduct() + " " + amount + " times");
        for (int i = 0; i < amount; i++) {
            listOfOrders().put(supplier, order);
        }
    }
}

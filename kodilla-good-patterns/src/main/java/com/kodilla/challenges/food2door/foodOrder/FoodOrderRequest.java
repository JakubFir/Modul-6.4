package com.kodilla.challenges.food2door.foodOrder;

import com.kodilla.challenges.food2door.foodOrder.supplier.Supplier;

public class FoodOrderRequest {

    private Supplier supplier;
    private FoodOrder order;
    private int amount;

    public int getAmount() {
        return amount;
    }

    public FoodOrderRequest(Supplier supplier, FoodOrder order, int amount) {
        this.supplier = supplier;
        this.order = order;
        this.amount = amount;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public FoodOrder getOrder() {
        return order;
    }
}

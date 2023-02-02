package com.kodilla.challenges.food2door.foodOrder;

import com.kodilla.challenges.food2door.supplier.Supplier;

public class FoodOrderDto {
    private Supplier supplier;
    private FoodOrder foodOrder;

    public FoodOrderDto(Supplier supplier, FoodOrder foodOrder) {
        this.supplier = supplier;
        this.foodOrder = foodOrder;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public FoodOrder getFoodOrder() {
        return foodOrder;
    }
}

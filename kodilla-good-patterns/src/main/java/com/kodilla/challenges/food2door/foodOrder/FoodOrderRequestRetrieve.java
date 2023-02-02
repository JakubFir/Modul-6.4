package com.kodilla.challenges.food2door.foodOrder;

import com.kodilla.challenges.food2door.supplier.Supplier;

public class FoodOrderRequestRetrieve {

    public FoodOrderRequest retrieve(Supplier supplier, FoodOrder foodOrder, int amount) {
        return new FoodOrderRequest(supplier, foodOrder, amount);
    }


}

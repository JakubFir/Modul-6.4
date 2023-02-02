package com.kodilla.challenges.food2door;

import com.kodilla.challenges.food2door.foodOrder.*;
import com.kodilla.challenges.food2door.information.FoodInformation;
import com.kodilla.challenges.food2door.supplier.SupplierService;

public class FoodApplication {
    public static void main(String[] args) {
        FoodOrderRequestRetrieve foodOrderRequestRetrevier = new FoodOrderRequestRetrieve();
        SupplierService supplierService = new SupplierService();
        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor(new FoodOrderService(), new FoodInformation(), new SupplierService());
        FoodOrderRequest foodOrderRequest = foodOrderRequestRetrevier.retrieve(supplierService.listOfSuppliers().get(1), new FoodOrder("pizza"), 8);

        foodOrderProcessor.process(foodOrderRequest);


    }
}

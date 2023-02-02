package com.kodilla.challenges.food2door.information;

import com.kodilla.challenges.food2door.supplier.Supplier;

public class FoodInformation implements FoodInformationRepository {

    @Override
    public void sendOrderConfirmation(Supplier supplier) {
        System.out.println("order from " + supplier.getSupplierName() + " confirmed");
    }
}

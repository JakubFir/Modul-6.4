package com.kodilla.challenges.food2door.information;

import com.kodilla.challenges.food2door.supplier.Supplier;

public interface FoodInformationRepository {

    void sendOrderConfirmation(Supplier supplier);
}

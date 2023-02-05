package com.kodilla.challenges.food2door.foodOrder.supplier;

import java.util.List;

public interface SupplierRepository {
    List<Supplier> listOfSuppliers();


    void process(Supplier supplier);
}

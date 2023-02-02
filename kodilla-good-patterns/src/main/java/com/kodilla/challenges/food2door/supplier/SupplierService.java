package com.kodilla.challenges.food2door.supplier;

import java.util.ArrayList;
import java.util.List;

public class SupplierService implements SupplierRepository {
    @Override
    public List<Supplier> listOfSuppliers() {
        List<Supplier> suppliers = new ArrayList<>();
        suppliers.add(new Supplier("ExtraFoodShop"));
        suppliers.add(new Supplier("HealthyShop"));
        suppliers.add(new Supplier("GlutenFreeShop"));
        return suppliers;
    }

    @Override
    public void process(Supplier supplier) {
        if (supplier.getSupplierName().equals("ExtraFoodShop")) {
            processForExtraFoodShop();
        } else if (supplier.getSupplierName().equals("HealthyShop")) {
            processForHealthyShop();
        } else processForGlutenFreeShop();
    }

    private void processForExtraFoodShop() {
        System.out.println("As a Extra food shop add one cookie");
    }

    private void processForHealthyShop() {
        System.out.println("As a Extra food shop add one apple");
    }

    private void processForGlutenFreeShop() {
        System.out.println("As a Extra food shop add one gluten free cookie");
    }

}

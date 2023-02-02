package com.kodilla.challenges.food2door.supplier;

import java.util.Objects;

public class Supplier {
    private String supplierName;

    public String getSupplierName() {
        return supplierName;
    }

    public Supplier(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(supplierName, supplier.supplierName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(supplierName);
    }


}

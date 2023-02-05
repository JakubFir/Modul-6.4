package com.kodilla.challenges.food2door.foodOrder;

import com.kodilla.challenges.food2door.information.FoodInformationRepository;
import com.kodilla.challenges.food2door.foodOrder.supplier.SupplierRepository;

public class FoodOrderProcessor {
    private FoodOrderRepository foodOrderRepository;
    private FoodInformationRepository foodinformationRepository;
    private SupplierRepository supplierRepository;

    public FoodOrderProcessor(FoodOrderRepository foodOrderRepository, FoodInformationRepository informationRepository, SupplierRepository supplierRepository) {
        this.foodOrderRepository = foodOrderRepository;
        this.foodinformationRepository = informationRepository;
        this.supplierRepository = supplierRepository;
    }

    public FoodOrderDto process(final FoodOrderRequest foodOrderRequest) {
        foodOrderRepository.addNewOrder(foodOrderRequest.getOrder(), foodOrderRequest.getSupplier(), foodOrderRequest.getAmount());
        supplierRepository.process(foodOrderRequest.getSupplier());
        foodinformationRepository.sendOrderConfirmation(foodOrderRequest.getSupplier());
        return new FoodOrderDto(foodOrderRequest.getSupplier(), foodOrderRequest.getOrder());
    }
}

package com.kodila.patters2.decorator.pizza;

import java.math.BigDecimal;

public class DoubleCrustPizzaOrder extends AbstractPizzaOrderDecorator {

    public DoubleCrustPizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "double crust ";
    }
}


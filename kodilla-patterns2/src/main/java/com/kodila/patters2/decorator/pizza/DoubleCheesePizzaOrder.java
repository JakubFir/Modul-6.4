package com.kodila.patters2.decorator.pizza;

import java.math.BigDecimal;


public class DoubleCheesePizzaOrder extends AbstractPizzaOrderDecorator {

    public DoubleCheesePizzaOrder(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + "cheese ";
    }
}

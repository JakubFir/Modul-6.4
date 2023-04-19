package com.kodila.patters2.decorator.pizza;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTestSuite {


    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(10), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();

        //When
        String ingredients = theOrder.getIngredients();

        //Then
        assertEquals("cheese", ingredients);
    }

    @Test
    public void testDoubleCheesePizzaOrderGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheesePizzaOrder(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(13), calculatedCost);
    }

    @Test
    public void testDoubleCheesePizzaOrderGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheesePizzaOrder(theOrder);

        //When
        String ingredients = theOrder.getIngredients();

        //Then
        assertEquals("cheese cheese", ingredients);
    }

    @Test
    public void testDoubleCrustPizzaOrderGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCrustPizzaOrder(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(14), calculatedCost);
    }

    @Test
    public void testDoubleCrustPizzaOrderGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCrustPizzaOrder(theOrder);

        //When
        String ingredients = theOrder.getIngredients();

        //Then
        assertEquals("cheese double crust ", ingredients);
    }

    @Test
    public void testDoubleCrustDoubleCheesePizzaOrderGetPrice() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCrustPizzaOrder(theOrder);
        theOrder = new DoubleCheesePizzaOrder(theOrder);

        //When
        BigDecimal calculatedCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(17), calculatedCost);
    }


    @Test
    public void testDoubleCrustDoubleCheesePizzaOrderGetIngredients() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCrustPizzaOrder(theOrder);
        theOrder = new DoubleCheesePizzaOrder(theOrder);

        //When
        String ingredients = theOrder.getIngredients();

        //Then
        assertEquals("cheese double crust cheese ", ingredients);
    }


}
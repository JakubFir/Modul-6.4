package com.kodila.patters2.decorator.pizza;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PizzaTestSuite {


    @Test
    public void testBasicTaxiOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(10), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetIngredients() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String ingredients = theOrder.getIngredients();
        // Then
        assertEquals("cheese", ingredients);
    }

    @Test
    public void testDoubleCheesePizzaOrderGetPrice() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheesePizzaOrder(theOrder);
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(13), calculatedCost);
    }

    @Test
    public void testDoubleCheesePizzaOrderGetIngredients() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheesePizzaOrder(theOrder);
        //when
        String ingredients = theOrder.getIngredients();
        //then
        assertEquals("cheese cheese", ingredients);
    }

    @Test
    public void testDoubleCrustPizzaOrderGetPrice() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCrustPizzaOrder(theOrder);
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(14), calculatedCost);
    }

    @Test
    public void testDoubleCrustPizzaOrderGetIngredients() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCrustPizzaOrder(theOrder);
        //when
        String ingredients = theOrder.getIngredients();
        //then
        assertEquals("cheese double crust ", ingredients);
    }

    @Test
    public void testDoubleCrustDoubleCheesePizzaOrderGetPrice() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCrustPizzaOrder(theOrder);
        theOrder = new DoubleCheesePizzaOrder(theOrder);
        //when
        BigDecimal calculatedCost = theOrder.getCost();
        //then
        assertEquals(new BigDecimal(17), calculatedCost);
    }


    @Test
    public void testDoubleCrustDoubleCheesePizzaOrderGetIngredients() {
        //given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCrustPizzaOrder(theOrder);
        theOrder = new DoubleCheesePizzaOrder(theOrder);
        //when
        String ingredients = theOrder.getIngredients();
        //then
        assertEquals("cheese double crust cheese ", ingredients);
    }


}
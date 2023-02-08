package com.kodilla.spring.calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    void testAdding() {
        //given
        //when
        double result = calculator.add(1, 1);
        //then
        assertEquals(2, result);
    }

    @Test
    void testSub() {
        //given
        //when
        double result = calculator.sub(1, 1);
        //then
        assertEquals(0, result);
    }

    @Test
    void testMul() {
        //given
        //when
        double result = calculator.mul(2, 2);
        //then
        assertEquals(4, result);
    }

    @Test
    void testDiv() {
        //given
        //when
        double result = calculator.div(10, 2);
        //then
        assertEquals(5, result);
    }
}


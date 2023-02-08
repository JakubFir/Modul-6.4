package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;

    @Test
    void testAdding(){
        //given
        //when
        calculator.add(1,1);
        //then
    }
    @Test
    void testSub(){
        //given
        //when
        calculator.sub(1,1);
        //then
    }
    @Test
    void testMul(){
        //given
        //when
        calculator.mul(2,2);
        //then
    }
    @Test
    void testDiv(){
        //given
        //when
        calculator.div(10,2);
        //then
    }

}

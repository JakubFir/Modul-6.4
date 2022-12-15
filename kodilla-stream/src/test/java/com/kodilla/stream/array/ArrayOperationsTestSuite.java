package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage(){
        //Given
        int[] numbers = {1,23,4,5,6,67,4,2,1,3,2,1,23,5};

        //When
         double average = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(10.5,average);

    }
}

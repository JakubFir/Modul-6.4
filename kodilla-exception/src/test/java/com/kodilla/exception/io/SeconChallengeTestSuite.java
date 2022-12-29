package com.kodilla.exception.io;


import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SeconChallengeTestSuite {
    @Test
    public void testProbablyIWillThrowException()
    {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();
        ExceptionHandling exceptionHandling = new ExceptionHandling();
       //then && when
        assertAll(
                () -> assertThrows(exceptionHandling.getClass(),() -> secondChallenge.probablyIWillThrowException(2,2)),
                () -> assertThrows(exceptionHandling.getClass(),() -> secondChallenge.probablyIWillThrowException(10,2)),
                () -> assertThrows(exceptionHandling.getClass(),() -> secondChallenge.probablyIWillThrowException(3,1.5)),
                () -> assertDoesNotThrow(()  ->secondChallenge.probablyIWillThrowException(1.5,2))
        );
    }
}

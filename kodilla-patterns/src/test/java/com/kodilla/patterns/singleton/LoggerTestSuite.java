package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static  Logger logger;


    @Test
    void testLogger(){
        //given
        logger = Logger.INSTANCE;
        logger.log("hello");
        //when
        String res = logger.getLastLog();
        //then
        Assertions.assertEquals("hello",res);
    }
}

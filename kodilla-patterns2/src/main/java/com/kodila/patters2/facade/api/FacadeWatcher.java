package com.kodila.patters2.facade.api;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class FacadeWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(com.kodila.patters2.facade.api.FacadeWatcher.class);

    @Before("execution(* com.kodila.patters2.facade.api.OrderFacade.processOrder(..))" + "&& args(order,userId) && target(object)")
    public void logBefore(OrderDto order, Long userId, @NotNull Object object) {
        LOGGER.info(object.getClass().getName() + " with order " + order.toString() + " for user with id " + userId);
    }

    @AfterThrowing(value = "execution(* com.kodila.patters2.facade.api.OrderFacade.processOrder(..))", throwing = "ex")
    public void logThrow(OrderProcessingException ex) {
        LOGGER.error("Something went wrong " + ex);
    }

    @After("execution(* com.kodila.patters2.facade.api.OrderFacade.processOrder(..))" + "&& args(order,userId) && target(object)")
    public void logAfter(OrderDto order, Long userId, @NotNull Object object) {
        LOGGER.info("ending process order");
    }


}

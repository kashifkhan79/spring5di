package com.springcodelab.didemo.controllers;

import com.springcodelab.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() {
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    public void testSayGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GREETING, propertyInjectedController.sayGreeting());
    }

}

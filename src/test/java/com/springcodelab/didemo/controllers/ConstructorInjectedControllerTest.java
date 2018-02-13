package com.springcodelab.didemo.controllers;

import com.springcodelab.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testSayGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GREETING, constructorInjectedController.sayGreeting());
    }
}

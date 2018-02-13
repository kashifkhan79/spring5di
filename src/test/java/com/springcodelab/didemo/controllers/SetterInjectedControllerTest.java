package com.springcodelab.didemo.controllers;

import com.springcodelab.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;

    @Before
    public void setUp() {
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testSayGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GREETING, setterInjectedController.sayGreeting());
    }

}

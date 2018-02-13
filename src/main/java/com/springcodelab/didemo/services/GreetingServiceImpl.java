package com.springcodelab.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GREETING = "Greetings from the service Original !!!";

    @Override
    public String sayGreeting() {
        return HELLO_GREETING;
    }
}

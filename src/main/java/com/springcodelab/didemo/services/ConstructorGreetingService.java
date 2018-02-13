package com.springcodelab.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Greeting from the ConstructorGreetingService";
    }
}

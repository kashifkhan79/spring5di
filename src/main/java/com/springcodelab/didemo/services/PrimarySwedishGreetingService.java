package com.springcodelab.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("sw")
public class PrimarySwedishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hälsning: Primärhälsotjänst";
    }
}

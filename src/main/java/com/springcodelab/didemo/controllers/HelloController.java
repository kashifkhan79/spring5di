package com.springcodelab.didemo.controllers;

import com.springcodelab.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    private GreetingService greetingService;

    public HelloController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
//        return "Hello ! from Hello Controller";
    }
}

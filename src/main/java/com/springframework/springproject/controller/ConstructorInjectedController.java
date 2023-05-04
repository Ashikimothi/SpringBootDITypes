package com.springframework.springproject.controller;

import com.springframework.springproject.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private final GreetingService greetingService;

    public String sayHello() {

        return greetingService.sayGreeting();
    }
}

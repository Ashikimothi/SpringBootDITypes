package com.springframework.springproject.controller;

import com.springframework.springproject.service.GreetingService;
import com.springframework.springproject.service.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }


    public String sayHello(){

        System.out.println("I'm in the Controller");

        return greetingService.sayGreeting();
    }
}

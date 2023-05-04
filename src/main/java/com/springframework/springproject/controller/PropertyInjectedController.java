package com.springframework.springproject.controller;

import com.springframework.springproject.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;


   public String sayHello() {
       return greetingService.sayGreeting();
   }
}

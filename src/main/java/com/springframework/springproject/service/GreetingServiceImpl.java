package com.springframework.springproject.service;

import org.springframework.stereotype.Service;


@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello EveryOne from the Base Service";
    }
}

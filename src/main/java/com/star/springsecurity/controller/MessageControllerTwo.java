package com.star.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageControllerTwo {

    @GetMapping("/san")
    public String getMessageNow(){
        return "Whats up my guy";
    }

}

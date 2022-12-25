package com.wfn.waterfilternotifier.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandingController {
    @GetMapping(value = "/hello-world")
    public String getHelloWorld(){
        return "Hello World";
    }
}
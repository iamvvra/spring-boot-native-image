package com.example.nativedocker.springbootnativeimage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AController {
    @GetMapping(value="/hello")
    public String getMethodName() {
        return "hai";
    }
    
}
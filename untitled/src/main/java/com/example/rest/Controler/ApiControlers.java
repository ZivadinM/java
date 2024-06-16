package com.example.rest.Controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControlers {

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }
}

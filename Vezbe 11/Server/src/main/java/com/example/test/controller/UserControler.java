package com.example.test.controller;

import com.example.test.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/users")
public interface UserControler {

    @PostMapping
    User createUser(int jmbg, String firstname, String lastname, int years);

    @GetMapping
    List<User> getUser();


    @PutMapping("/{userId}")
    User updateUser(@PathVariable int jmbg, String firstname,String lastname, int years);
}

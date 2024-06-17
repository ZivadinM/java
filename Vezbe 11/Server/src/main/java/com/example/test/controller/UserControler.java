package com.example.test.controller;

import com.example.test.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(value = "/users")
public interface UserControler {

    @PostMapping
    User createUser(int jmbg, String firstname, String lastname, int years);

    @GetMapping
    List<User> getUser();

    @GetMapping("/{id}")
    Optional<User> getUserById(@PathVariable int id);

    @PutMapping("/{jmbg}")
    User updateUser(@PathVariable int jmbg, String firstname,String lastname, int years);
}

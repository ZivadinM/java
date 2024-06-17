package com.example.test.controller.impl;

import com.example.test.controller.UserControler;
import com.example.test.model.User;
import com.example.test.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserControlerImpl implements UserControler {

    private final UserService userService;

    public UserControlerImpl(final UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<User> getUser() {
        return userService.getAllUsers();
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userService.findById(id);
    }

    @Override
    public User createUser(int jmbg, String firstname, String lastname, int years) {
        User user = new User(jmbg,firstname,lastname,years);
        return userService.saveUser(user);
    }

    @Override
    public User updateUser(int jmbg, String firstname, String lastname, int years) {
        return userService.updateUser(jmbg,firstname,lastname,years);
    }
}

package com.example.test.service;

import com.example.test.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User saveUser(User user);

    User updateUser(int jmbg, String firstname,String lastname, int years);
}

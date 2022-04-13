package com.example.springbootmvcapp.service;

import com.example.springbootmvcapp.model.User;

import java.util.List;

public interface UserService {

    User findById(long id);

    List<User> findAll();

    User saveUser(User user);

    void deleteById(long id);
}

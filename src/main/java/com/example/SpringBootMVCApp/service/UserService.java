package com.example.SpringBootMVCApp.service;

import com.example.SpringBootMVCApp.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {

    User findById(long id);

    List<User> findAll();

    @Transactional
    User saveUser(User user);

    @Transactional
    void deleteById(long id);
}

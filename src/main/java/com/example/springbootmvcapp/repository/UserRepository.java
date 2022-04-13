package com.example.springbootmvcapp.repository;


import com.example.springbootmvcapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}

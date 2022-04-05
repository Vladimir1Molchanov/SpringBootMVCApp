package com.example.SpringBootMVCApp.repository;


import com.example.SpringBootMVCApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}

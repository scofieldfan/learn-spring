package com.example.springboothelloworld.repository;

import com.example.springboothelloworld.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

    List<User> findByUserNameOrEmail(String username, String email);
}
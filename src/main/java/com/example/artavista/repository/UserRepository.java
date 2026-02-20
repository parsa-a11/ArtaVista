package com.example.artavista.repository;

import com.example.artavista.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByDisableDateIsNull();
}

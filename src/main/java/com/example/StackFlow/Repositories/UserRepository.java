package com.example.StackFlow.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StackFlow.Model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
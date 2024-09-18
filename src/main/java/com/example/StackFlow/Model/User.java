package com.example.StackFlow.Model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true , nullable = false)
    private String username;
    @Column(unique = true , nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private int reputation=0;
    
    private LocalDateTime CreatedAt = LocalDateTime.now();
    
}

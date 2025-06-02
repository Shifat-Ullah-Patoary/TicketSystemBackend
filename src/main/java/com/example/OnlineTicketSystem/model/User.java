package com.example.OnlineTicketSystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "User_Table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="user_name")
    private String username;

    @Column(name = "user_password")
    private String password;
}

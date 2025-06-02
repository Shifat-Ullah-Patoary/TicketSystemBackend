package com.example.OnlineTicketSystem.Controller;

import com.example.OnlineTicketSystem.Service.UserService;
import com.example.OnlineTicketSystem.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user)
    {
        return service.addUser(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
        System.out.println("Received login request for user: " + loginRequest.username());
        User user = service.findByUsername(loginRequest.username());
        if (user != null) {
            System.out.println("User found: " + user.getUsername());
            if (user.getPassword().equals(loginRequest.password())) {
                System.out.println("Login successful for user: " + user.getUsername());
                return ResponseEntity.ok("Login successful");
            } else {
                System.out.println("Password mismatch for user: " + user.getUsername());
                return new ResponseEntity<>("Invalid credentials", HttpStatus.UNAUTHORIZED);
            }
        } else {
            System.out.println("User not found: " + loginRequest.username());
            return new ResponseEntity<>("Invalid credentials", HttpStatus.UNAUTHORIZED);
        }
    }

    record LoginRequest(String username, String password) {}


    @GetMapping("/getdata")
    public List<User> getAllData()
    {
        return service.getUserData();
    }


}

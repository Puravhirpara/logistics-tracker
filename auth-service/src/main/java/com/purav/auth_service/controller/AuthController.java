package com.purav.auth_service.controller;


import com.purav.auth_service.model.User;
import com.purav.auth_service.repository.UserRepository;
import com.purav.auth_service.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired private UserRepository userRepo;
    @Autowired private JwtService jwtService;


    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user) {
        try {
            if (userRepo.findByEmail(user.getEmail()).isPresent()) {
                return ResponseEntity.status(HttpStatus.CONFLICT).body("User already exists!");
            }
            userRepo.save(user);
            System.out.println("User saved: " + user.getEmail());
            return ResponseEntity.status(HttpStatus.CREATED).body("Registered successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());

        }
    }
    
    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> body) {
        String email = body.get("email");
        String password = body.get("password");

        Optional<User> user = userRepo.findByEmail(email);
        if (user.isPresent() && user.get().getPassword().equals(password)) {
        	String token = jwtService.generateToken(email); 
            return jwtService.generateToken(token);
        } else {
            return "Invalid credentials!";
        }
    }
    
}

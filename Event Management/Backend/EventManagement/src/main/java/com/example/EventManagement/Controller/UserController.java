package com.example.EventManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.EventManagement.Service.UserService;
import com.example.EventManagement.Model.User;

import java.awt.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User existingUser = userService.findByName(user.getName());
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return "Login successful";
        } else {
            return "Login failed";
        }
    }

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        if (userService.existsByName(user.getName())) {
            return "Username already exists, please try another name";
        } else {
            System.out.println("c" + user);
            return userService.save(user);
          }
    }
}
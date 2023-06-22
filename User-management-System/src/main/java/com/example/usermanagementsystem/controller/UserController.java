package com.example.usermanagementsystem.controller;

import com.example.usermanagementsystem.model.User;
import com.example.usermanagementsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userId}")
    public String getUser(@PathVariable Integer userId) {
        return userService.getUser(userId);
    }

    @PostMapping
    public String addUser(@RequestBody List<User> users) {
        return userService.addUser(users);
    }

    @PutMapping("/{userId}")
    public User updateUserInfo(@PathVariable Integer userId, @RequestBody User user) {
        user.setUserId(userId);
        return userService.updateUserInfo(user);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable Integer userId) {
        boolean deleted = userService.deleteUser(userId);
        if (deleted) {
            return "User is deleted";
        } else {
            return "User does not exist";
        }
    }
}

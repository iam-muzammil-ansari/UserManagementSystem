package com.example.usermanagementsystem.service;

import com.example.usermanagementsystem.repository.UserRepo;
import com.example.usermanagementsystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public String addUser(List<User> users) {
        for (User user : users) {
            userRepo.addUser(user);
        }
        return "New Users added";
    }

    public List<User> getAllUsers() {
        return userRepo.getUsers();
    }

    public String getUser(Integer userId) {
       User user = userRepo.getUserById(userId);
        if (user != null) {
            return user.toString();
        } else {
            return "User not found";
        }
    }

    public User updateUserInfo(User user) {
        userRepo.updateUser(user);
        return user;
    }

    public boolean deleteUser(Integer userId) {
        int initialSize = userRepo.getUsers().size();
        userRepo.deleteUser(userId);
        int finalSize = userRepo.getUsers().size();
        return finalSize < initialSize;
    }
}

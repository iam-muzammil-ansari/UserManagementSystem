package com.example.usermanagementsystem.repository;

import com.example.usermanagementsystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepo {

    @Autowired
    private List<User> userList;

    public List<User> getUsers() {
        return userList;
    }

    public User getUserById(int userId) {
        for (User user : userList) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public void updateUser(User updatedUser) {
        for (User user : userList) {
            if (user.getUserId() == updatedUser.getUserId()) {
                user.setName(updatedUser.getName());
                user.setUserName(updatedUser.getUserName());
                user.setAddress(updatedUser.getAddress());
                user.setPhoneNumber(updatedUser.getPhoneNumber());
                break;
            }
        }
    }

    public boolean deleteUser(Integer userId) {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            if (user.getUserId().equals(userId)) {
                userList.remove(i);
                return true;
            }
        }
        return false;
    }
}

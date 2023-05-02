package com.jawad.UserManagementSystem.services;

import com.jawad.UserManagementSystem.models.User;
import com.jawad.UserManagementSystem.repositries.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public List<User> getAllUsers() {
        return userDao.getAllUsersFromDataSource();
    }

    public String addUser(User newUser) {
        boolean insertionStatus = userDao.insertUser(newUser);
        if (insertionStatus) {
            return "User insertion successfull !!!!";
        } else {
            return "User insertion failed !!!!";
        }
    }

    public User getUserById(int userId) {
        for (User user : userDao.getAllUsersFromDataSource()) {
            if (user.getUserId() == userId) {
                return user;
            }
        }

        return null;
    }

    public String updateUser(User updatedUser, int userId) {
        User user = getUserById(userId);
        if (user != null) {
            user.setUserName(updatedUser.getUserName());
            user.setDateOfBirth(updatedUser.getDateOfBirth());
            user.setEmail(updatedUser.getEmail());
            user.setPhoneNumber(updatedUser.getPhoneNumber());
            user.setDate(updatedUser.getDate());
            user.setTime(updatedUser.getTime());
            return "User updated successfully !!!!";
        } else {
            return "User update failed !!!!";
        }
    }

    public String deleteUser(int userId) {
        User user = getUserById(userId);
        if (user != null) {
            userDao.remove(user);
            return "User deleted successfully !!!!";
        } else {
            return "User deletion failed !!!!";
        }
    }

}

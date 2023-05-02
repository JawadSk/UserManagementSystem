package com.jawad.UserManagementSystem.Cotroller;

import com.jawad.UserManagementSystem.models.User;
import com.jawad.UserManagementSystem.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "addUser")
    public String addUser(@Valid @RequestBody User newUser) {
        return userService.addUser(newUser);
    }

    @GetMapping(value = "getUser/{userId}")
    public User getUserById(@PathVariable int userId) {
        return userService.getUserById(userId);
    }

    @GetMapping(value = "getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @PutMapping(value = "updateUserInfo/{userId}")
    public String updateUserInfo(@Valid @RequestBody User updatedUser, @PathVariable("userId") int userId) {
        return userService.updateUser(updatedUser, userId);
    }

    @DeleteMapping(value = "deleteUser/{userId}")
    public String deleteUser(@PathVariable int userId) {
        return userService.deleteUser(userId);
    }
}

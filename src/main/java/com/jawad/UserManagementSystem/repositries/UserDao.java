package com.jawad.UserManagementSystem.repositries;

import com.jawad.UserManagementSystem.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    private List<User> userList;

    public UserDao() {
        userList = new ArrayList<>();
    }

    public List<User> getAllUsersFromDataSource() {
        return userList;
    }

    public boolean insertUser(User newUser) {
        userList.add(newUser);
        return true;
    }

    public void remove(User user) {
        userList.remove(user);
    }
}

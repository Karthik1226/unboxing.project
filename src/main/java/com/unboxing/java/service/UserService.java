package com.unboxing.java.service;

import com.unboxing.java.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User createUser(User user);
    void deleteUser(int id);
}

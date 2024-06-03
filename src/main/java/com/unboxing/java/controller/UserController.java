package com.unboxing.java.controller;

import com.unboxing.java.entity.User;
import com.unboxing.java.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping()
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") int id) {
         userService.deleteUser(id);
    }
}

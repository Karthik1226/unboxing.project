package com.unboxing.java.service.serviceimpl;

import com.unboxing.java.entity.User;
import com.unboxing.java.repository.UserRepo;
import com.unboxing.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepo.deleteById(id);
    }
}

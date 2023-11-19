package com.app.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.entity.User;
import com.app.demo.repository.UserRepository;


@Service
public class UserService {
	
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public User updateUserStatus(Long userId, boolean active) {
        User user = getUserById(userId);

        if (user != null) {
            user.setIsActive(active);
            userRepository.save(user);
        }

        return user;
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}

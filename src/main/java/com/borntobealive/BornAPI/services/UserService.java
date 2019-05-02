package com.borntobealive.BornAPI.services;

import com.borntobealive.BornAPI.entities.User;
import com.borntobealive.BornAPI.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User createOrUpdate(User user) {
        return userRepository.saveAndFlush(user);
    }
}

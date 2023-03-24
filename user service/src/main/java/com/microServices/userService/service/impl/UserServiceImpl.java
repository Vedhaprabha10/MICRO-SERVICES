package com.microServices.userService.service.impl;

import com.microServices.userService.entity.User;
import com.microServices.userService.exception.ResourceNotFoundException;
import com.microServices.userService.repositories.UserRepository;
import com.microServices.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User create(User user) {
        //generate unique userid
        String randomId = UUID.randomUUID().toString();
        user.setUserId(randomId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(String userId) {
        return userRepository.findById(userId).orElseThrow(() ->new ResourceNotFoundException("User given id is not found in server "+userId));
    }

    @Override
    public User delete(String userId) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }
}

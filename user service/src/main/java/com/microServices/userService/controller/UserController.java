package com.microServices.userService.controller;

import com.microServices.userService.entity.User;
import com.microServices.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    //create
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1 = userService.create(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //get All
    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        List<User> allUser = userService.getAll();
        return ResponseEntity.status(HttpStatus.FOUND).body(allUser);
    }

    //get user by id
    @GetMapping("/{userId}")
    public ResponseEntity<User> getById(@PathVariable String userId){
        User user = userService.getById(userId);
        return ResponseEntity.status(HttpStatus.FOUND).body(user);
    }
}

package com.microServices.userService.service;

import com.microServices.userService.entity.User;

import java.util.List;

public interface UserService {

    //create
    User create (User user);

    //get all
    List<User> getAll();

    //get by id
    User getById(String userId);

    //delete
    User delete(String userId);

    //update
    User update (User user);
}

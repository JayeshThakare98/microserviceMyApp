package com.user.service;

import java.util.List;

import com.user.entity.User;

public interface UserService {
	  //user operations

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userId

    User getUser(Integer userId);

    //TODO: delete
    void deleteUserById (Integer userId);
    //TODO: update
    User updateUserById(Integer userId, User user);

}

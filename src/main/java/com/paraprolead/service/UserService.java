package com.paraprolead.service;

import com.paraprolead.model.User;

import java.util.List;

public interface UserService {

    User getUserById(Long uid);
    List<User> getAllUsers();
    void deleteUser(Long uid);
    User createUser(User user);
    User updateUser(User user);



}

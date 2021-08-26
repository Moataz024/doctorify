package com.paraprolead.service;


import com.paraprolead.model.User;
import com.paraprolead.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{


    @Autowired
    UserRepository uRepo;

    @Override
    public User getUserById(Long uid) {
        return uRepo.getById(uid);
    }

    @Override
    public void deleteUser(Long uid) {

        uRepo.deleteById(uid);

    }

    @Override
    public User createUser(User user) {
        return uRepo.save(user);
    }

    @Override
    public User updateUser(User user) {
        return uRepo.save(user);
    }

    public List<User> getAllUsers(){
        return uRepo.findAll();
    }
}

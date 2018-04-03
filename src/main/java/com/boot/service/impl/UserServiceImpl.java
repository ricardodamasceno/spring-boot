package com.boot.service.impl;

import com.boot.model.User;
import com.boot.repository.UserRepository;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return (List<User>) userRepository.findAll();
    }

}
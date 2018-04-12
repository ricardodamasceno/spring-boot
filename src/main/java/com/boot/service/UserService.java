package com.boot.service;

import com.boot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    User findById(Long id);

}

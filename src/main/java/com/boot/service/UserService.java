package com.boot.service;

import com.boot.model.User;
import com.boot.vo.request.UserRequestVO;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();
    User findById(Long id);
    User createUser(UserRequestVO request);

}

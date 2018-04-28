package com.boot.service.impl;

import com.boot.model.User;
import com.boot.repository.UserRepository;
import com.boot.service.UserService;
import com.boot.vo.request.UserRequestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        return userRepository.findById(id).get();
    }

    public void deleteUser(Long id){
        userRepository.delete(findById(id));
    }

    public User createUser(UserRequestVO request){
        User user = new User();
        user.setName(request.getName());
        user.setLastName(request.getLastName());
        user.setBirthDay(request.getBirthDate());
        return userRepository.save(user);
    }

}

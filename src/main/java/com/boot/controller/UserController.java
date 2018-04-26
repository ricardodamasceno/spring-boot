package com.boot.controller;

import com.boot.model.User;
import com.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(RestMethods.V1 + RestMethods.User.PATH)
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping(value = RestMethods.User.V1.FIND_USER_BY_ID, method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody User findUserById(@PathVariable("id") Long id){
        return userService.findById(id);
    }

}

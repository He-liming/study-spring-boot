package com.xiaoming.springboot.controller;

import com.xiaoming.springboot.entity.User;
import com.xiaoming.springboot.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getUser() {
        List<User> userList = userRepository.findAll();
        return userList;
    }

}

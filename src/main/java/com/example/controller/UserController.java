package com.example.controller;

import com.example.feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author tinko
 * @Description //TODO
 * @Date 2019/4/23 15:08
 **/
@RestController
public class UserController {

    @Autowired
    private UserFeign userFeign;

    @RequestMapping("/user")
    public String user(String name) {
        return userFeign.user(name);
    }
}

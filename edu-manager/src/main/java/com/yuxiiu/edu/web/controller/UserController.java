package com.yuxiiu.edu.web.controller;

import com.yuxiu.edu.model.User;
import com.yuxiu.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : 李清钢
 * @date : 2019-11-23 19:21
 **/
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("..............");
        return null;
    }
    @RequestMapping("find")
    public User find(Integer id){
        System.out.println("..............");
        User user = userService.findUserById(id);
        System.out.println(user);
        return null;
    }
}

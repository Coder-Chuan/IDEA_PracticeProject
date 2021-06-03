package com.yuechuan.controller;

import com.yuechuan.domain.User;
import com.yuechuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
@ResponseBody
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userService.findAll();
    }

    @RequestMapping("/findById")
    public User findById(String id){
        return userService.findById(id);
    }

    @RequestMapping("/update")
    public void update(@RequestBody User user){
        System.out.println(user);
        userService.update(user);
    }

}

package com.sunjx.cache.controller;

import com.sunjx.cache.entity.User;
import com.sunjx.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by jx on 2018/6/13.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PutMapping
    @GetMapping
    @RequestMapping("/get")
    public Map getUser(@PathVariable long user_id){
        Map map=userService.findUserById(user_id);
        return map;
    }
    @RequestMapping("/update")
    public String updateUser(@PathVariable User user){

        return null;
    }
    @RequestMapping("/delete")
    public String deleteUser(@PathVariable long user_id){

        return null;
    }
}

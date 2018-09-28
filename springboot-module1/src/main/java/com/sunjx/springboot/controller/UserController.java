package com.sunjx.springboot.controller;

import com.sunjx.springboot.entity.User;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by jx on 2018/6/12.
 */
@Controller
@RequestMapping("/user")
@PropertySource("")
public class UserController {
    @RequestMapping("/get/{id}")
    public String getUser(@PathVariable String id){
        return "";
    }

    @RequestMapping("/${query.all}.json")
    public List<User> all(){
        return null;
    }
}

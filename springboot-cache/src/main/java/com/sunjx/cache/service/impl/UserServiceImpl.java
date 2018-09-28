package com.sunjx.cache.service.impl;

import com.sunjx.cache.dao.UserMapper;
import com.sunjx.cache.entity.User;
import com.sunjx.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jx on 2018/6/14.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public Map findUserById(long id) {
        Map map=new HashMap();
        User user=userMapper.getUserById(id);
        map.put("result",1);
        map.put("msg",user);
        return map;
    }

    @Override
    public Map updateUserById(User user) {
        Map map=new HashMap();
        userMapper.updateUserById(user);
        map.put("result",1);
        map.put("msg","更新成功");
        return map;
    }

    @Override
    public Map deleteUserById(long id) {
        Map map=new HashMap();
        userMapper.deleteUserById(id);
        map.put("result",1);
        map.put("msg","更新成功");
        return map;
    }
}

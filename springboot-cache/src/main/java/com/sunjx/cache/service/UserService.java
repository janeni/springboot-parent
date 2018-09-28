package com.sunjx.cache.service;

import com.sunjx.cache.entity.User;

import java.util.Map;

/**
 * Created by jx on 2018/6/14.
 */
public interface UserService {
    public Map findUserById(long id);

    public Map updateUserById(User user);

    public Map deleteUserById(long id);
}

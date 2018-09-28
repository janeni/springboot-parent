package com.sunjx.springboot.service.impl;

import com.sunjx.springboot.service.CreditUserService;
import com.sunjx.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jx on 2018/6/12.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    CreditUserService creditUserService;

    @Override
    public void order() {

    }
}

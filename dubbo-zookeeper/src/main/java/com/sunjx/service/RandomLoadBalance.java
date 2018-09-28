package com.sunjx.service;

import com.sunjx.AbsLoadBalance;

import java.util.List;
import java.util.Random;

/**
 * Auther: jx
 * Date: 2018/9/4
 * Time: 19:24
 */
public class RandomLoadBalance extends AbsLoadBalance{
    @Override
    protected String doSelect(List<String> serviceRepos) {
        int length=serviceRepos.size();
        Random random=new Random();
        return serviceRepos.get(random.nextInt(length));
    }
}

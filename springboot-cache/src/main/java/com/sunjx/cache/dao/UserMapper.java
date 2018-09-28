package com.sunjx.cache.dao;

import com.sunjx.cache.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by jx on 2018/6/13.
 */
public interface UserMapper {
    public User getUserById(@Param("user_id") long user_id);

    public void updateUserById(User user);

    public void deleteUserById(long user_id);
}

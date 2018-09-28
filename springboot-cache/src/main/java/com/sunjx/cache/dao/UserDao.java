package com.sunjx.cache.dao;

import com.sunjx.cache.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by jx on 2018/6/13.
 */
@Repository
public class UserDao {
    @Autowired
    JdbcTemplate jdbcTemplate;//默认加事务

    public User getUser(Long userId){
        String sql="select * from user where id=?";
        User user=jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user=new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setDepartment_id(resultSet.getInt("department_id"));
                return user;
            }
        },userId);
        return user;
    }

    public Map getUserMap(Long userId){
        String sql="select * from user where id=?";
        Map map=jdbcTemplate.queryForMap(sql,userId);
        return map;
    }

    public Integer insertUser(final User user){
        final String sql="insert into user (name,department_id) values(?,?)";
        KeyHolder keyHolder=new GeneratedKeyHolder();
        jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {

                //指出自增主键的列名
                PreparedStatement ps=connection.prepareStatement(sql,new String[]{"id"});
                ps.setString(1,user.getName());
                ps.setInt(2,user.getDepartment_id());
                return ps;
            }
        },keyHolder);
        return keyHolder.getKey().intValue();
    }


}

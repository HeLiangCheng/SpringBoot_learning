package com.springboot.demo.database.dao.jdbctemple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Liang on 2017/11/15.

 jdbcTemplate只是最基本的几个操作，更多其他数据访问操作的使用请参考：JdbcTemplate API

 */
@Repository
public class UserDaoImpl implements  IUserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(String name, Integer age) {
        String sql="INSERT INTO `user`(NAME,age) VALUES(?,?)";
        Object[] param ={name,age};
        jdbcTemplate.update(sql,param);
    }

    @Override
    public void update(Integer id, String name, Integer age) {
        String sql="UPDATE `user` set NAME=?,age=? WHERE id=?";
        Object[] param ={name,age,id};
        jdbcTemplate.update(sql,param);
    }

    @Override
    public void deleteByName(String name) {
        String sql="DELETE  from `user` WHERE NAME = ?";
        Object[] param ={name};
        jdbcTemplate.update(sql,param);
    }

    @Override
    public Integer getAllUsers() {
        String sql ="select count(*) from user";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

}

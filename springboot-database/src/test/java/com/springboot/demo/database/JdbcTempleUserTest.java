package com.springboot.demo.database;

import com.springboot.demo.database.dao.jdbctemple.IUserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Liang on 2017/11/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTempleUserTest {

    @Autowired
    private IUserDao userDao;

    @Test
    public void testuser(){
        int num=userDao.getAllUsers();
        System.out.println("人员总数："+ num);
    }

    @Test
    public  void testaddUser(){
        userDao.create("Lucy",10);
        System.out.println("新增人员成功");
    }


}

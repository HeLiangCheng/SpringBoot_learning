package com.springboot.demo.database;

import com.springboot.demo.database.dao.mybatis.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Liang on 2017/11/15.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MyBatisUserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void saveUser(){
        userMapper.addUser("zhaotao",20);
        System.out.println("新增成功");
    }

    @Test
    public  void  count(){
       int num=userMapper.findCount("c");
        System.out.println(num);
    }

}

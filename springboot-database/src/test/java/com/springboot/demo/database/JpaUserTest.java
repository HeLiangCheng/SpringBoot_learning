package com.springboot.demo.database;

import com.springboot.demo.database.dao.jpa.UserRepository;
import com.springboot.demo.database.dao.jpa.UserRepository;
import com.springboot.demo.database.model.User;
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
public class JpaUserTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void userTest(){
        User user = userRepository.findUserByName("jim");
        System.out.println(user);
    }

    @Test
    public void userTest2(){
        User user=new User("hlc",20);
        userRepository.save(user);
    }

}

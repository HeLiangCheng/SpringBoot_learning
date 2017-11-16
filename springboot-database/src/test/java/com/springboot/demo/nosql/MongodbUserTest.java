package com.springboot.demo.nosql;

import com.springboot.demo.nosql.mongodb.MongodbUser;
import com.springboot.demo.nosql.mongodb.MongodbUserRepository;
import org.junit.Before;
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
public class MongodbUserTest {

    @Autowired
    private  MongodbUserRepository  mongodbUserRepository;

    @Before
    public void setUp() {
        mongodbUserRepository.deleteAll();
    }
    @Test
    public void test() throws Exception {
        // 创建三个User，并验证User总数
        mongodbUserRepository.save(new MongodbUser(1L, "didi", 30));
        mongodbUserRepository.save(new MongodbUser(2L, "mama", 40));
        mongodbUserRepository.save(new MongodbUser(3L, "kaka", 50));
       System.out.println(mongodbUserRepository.findAll().size());
    }
}

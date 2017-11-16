package com.springboot.demo.nosql;

import com.springboot.demo.noql.redis.UserRedisModel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Liang on 2017/11/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisApplicationTests {

    @Autowired
    private RedisTemplate<String,UserRedisModel> redisTemplate;

    @Test
    public void test(){
        UserRedisModel user = new UserRedisModel("超人", 20);
        redisTemplate.opsForValue().set(user.getName(), user);
        user = new UserRedisModel("蝙蝠侠", 30);
        redisTemplate.opsForValue().set(user.getName(), user);
        user = new UserRedisModel("蜘蛛侠", 40);
        redisTemplate.opsForValue().set(user.getName(), user);
        System.out.println(redisTemplate.opsForValue().get("超人").getAge().longValue());
        System.out.println(redisTemplate.opsForValue().get("蝙蝠侠").getAge().longValue());
        System.out.println(redisTemplate.opsForValue().get("蜘蛛侠").getAge().longValue());
    }
}

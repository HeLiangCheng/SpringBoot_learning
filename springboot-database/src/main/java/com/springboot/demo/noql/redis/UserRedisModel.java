package com.springboot.demo.noql.redis;

import java.io.Serializable;

/**
 * Created by Liang on 2017/11/15.
 */
public class UserRedisModel implements Serializable{
    private String name;
    private Integer age;

    public UserRedisModel() {
    }

    public UserRedisModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}

package com.springboot.demo.nosql.mongodb;

import javax.persistence.Id;

/**
 * Created by Liang on 2017/11/15.
 */
public class MongodbUser {

    @Id
    private Long id;
    private String name;
    private int age;

    public MongodbUser() {
    }

    public MongodbUser(Long id, String name, int age) {
        this.id=id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

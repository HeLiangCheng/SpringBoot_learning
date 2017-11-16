package com.springboot.demo.nosql.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Liang on 2017/11/15.
 */

public interface MongodbUserRepository extends MongoRepository<MongodbUser,Long> {

    MongodbUser findByUsername(String username);
}

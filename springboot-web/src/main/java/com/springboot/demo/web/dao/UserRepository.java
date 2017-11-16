package com.springboot.demo.web.dao;

import com.springboot.demo.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Liang on 2017/11/15.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}

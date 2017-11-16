package com.springboot.demo.web.service;

import com.springboot.demo.web.model.User;

import java.util.List;

/**
 * Created by Liang on 2017/11/16.
 */
public interface IUserService {

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);

    User findUserById(Long id);

    List<User> findUserList();

}

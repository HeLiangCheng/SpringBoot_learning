package com.springboot.demo.database.dao.jdbctemple;

/**
 * Created by Liang on 2017/11/15.
 */
public interface IUserDao {
    /**
     * 新增一个用户
     * @param name
     * @param age
     */
    void create(String name, Integer age);

    /**
     * 更新用户信息
     * @param id
     * @param name
     * @param age
     */
    void  update(Integer id, String name, Integer age);

    /**
     * 根据name删除一个用户高
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     */
    Integer getAllUsers();

}

package com.springboot.demo.database.dao.mybatis;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.springboot.demo.database.model.User;

/**
 * Created by Liang on 2017/11/15.

参数传递绑定
  Mybatis通过以下几种不同传参方式来实现前文中实现的插入操作。
    1. 使用@Param
         @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
         int insert(@Param("name") String name, @Param("age") Integer age

        @Param中定义的name对应了SQL中的#{name}，age对应了SQL中的#{age}

    2.Map
         @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name,jdbcType=VARCHAR}, #{age,jdbcType=INTEGER})")
         int insertByMap(Map<String, Object> map);

    3.对象
         @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
         int insertByUser(User user);

         #{name}、#{age}就分别对应了User对象中的name和age属性

返回结果的绑定
         对于增、删、改操作相对变化较小。而对于“查”操作，我们往往需要进行多表关联，汇总计算等操作，那么对于查询的结果往往就不再是简单的实体对象了，往往需要返回一个与数据库实体不同的包装类，那么对于这类情况，就可以通过@Results和@Result注解来进行绑定，具体如下：

          @Results({
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
         })
         @Select("SELECT name, age FROM user")
         List<User> findAll();

 */
@Mapper
public interface UserMapper {

    @Select("slect * from User where name=#{name}")
    User findUserByName(@Param("name") String name);

    @Insert("insert into User(name,age) value(#{name},#{age})")
    void addUser(@Param("name") String name, @Param("age") int age);

    @Select("select count(*) from User where name like '%${name}%'")
    int findCount(@Param("name") String name);
}

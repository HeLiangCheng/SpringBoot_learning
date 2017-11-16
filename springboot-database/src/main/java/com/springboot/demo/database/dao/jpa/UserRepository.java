package com.springboot.demo.database.dao.jpa;

import com.springboot.demo.database.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by Liang on 2017/11/15.

 JpaRepository接口的API文档，可以看到该接口本身已经实现了创建（save）、更新（save）、删除（delete）、查询（findAll、findOne）等基本操作的函数，因此对于这些基础操作的数据访问就不需要开发者再自己定义。
 在我们实际开发中，JpaRepository接口定义的接口往往还不够或者性能不够优化，我们需要进一步实现更复杂一些的查询或操作。由于本文重点在spring boot中整合spring-data-jpa，在这里先抛砖引玉简单介绍一下spring-data-jpa中让我们兴奋的功能，后续再单独开篇讲一下spring-data-jpa中的常见使用。

 在上例中，我们可以看到下面两个函数：
 User findByName(String name)
 User findByNameAndAge(String name, Integer age)
 它们分别实现了按name查询User实体和按name和age查询User实体，可以看到我们这里没有任何类SQL语句就完成了两个条件查询方法。这就是Spring-data-jpa的一大特性：通过解析方法名创建查询。
 除了通过解析方法名来创建查询外，它也提供通过使用@Query 注解来创建查询，您只需要编写JPQL语句，并通过类似“:name”来映射@Param指定的参数，就像例子中的第三个findUser函数一样。
 Spring-data-jpa的能力远不止本文提到的这些，由于本文主要以整合介绍为主，对于Spring-data-jpa的使用只是介绍了常见的使用方式。诸如@Modifying操作、分页排序、原生SQL支持以及与Spring MVC的结合使用等等

 */
public interface UserRepository extends JpaRepository<User,Long>{

    User findUserByName(String name);

    User findUserByNameAndAge(String name, int age);

    @Query("from User u where u.name=:name")
    List<User> findUser(@Param("name") String name);

}
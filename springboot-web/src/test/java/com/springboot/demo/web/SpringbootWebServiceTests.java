package com.springboot.demo.web;

import com.springboot.demo.web.model.User;
import com.springboot.demo.web.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootWebServiceTests {

	@Autowired
	private IUserService userService;

	@Test
	public void test1() {
		List<User> userList =userService.findUserList();
		for(User item : userList){
			System.out.println(item.getName()+" : "+item.getAge());
		}
	}

}

package com.stock.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stock.hibernet.service.UserService;

import junit.framework.Assert;

public class TestBoundary {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void minMaxPasswordLength() {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("stock-application.xml");
        UserService userservice = (UserService) context.getBean("userService");
		int min = 6, max = 12;
		Assert.assertTrue(min <= userservice.getUser(1).getPassword().length() && userservice.getUser(1).getPassword().length() <= max);

	}

}

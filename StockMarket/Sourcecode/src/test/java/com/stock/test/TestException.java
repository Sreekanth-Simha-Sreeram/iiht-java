package com.stock.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
import com.stock.hibernet.model.User;
import com.stock.hibernet.service.AdminService;
import com.stock.hibernet.service.UserService;

import junit.framework.Assert;

public class TestException {

	@Test
	public void testEmptyIPO()  {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("stock-application.xml");
        UserService userservice = (UserService) context.getBean("userService");
        List <IPO> result = userservice.viewIPO();
        Assert.assertNotNull(result);
	}
	@Test
	public void testEmptyCompany()  {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("stock-application.xml");
        AdminService adminservice = (AdminService) context.getBean("adminService");
        List <Company> result = adminservice.listAllCompany();
        Assert.assertNotNull(result);
	}
	@Test
	public void userNotAllowedToCreateCompany()  {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("stock-application.xml");
        AdminService adminservice = (AdminService) context.getBean("adminService");
        UserService userservice = (UserService) context.getBean("userService");
        User user = new User();
        user.setConfirmed("Yes");
        user.setEmail("user@test.com");
        user.setMobilenumber("9900990099");
        user.setPassword("user@1234");
        user.setUsername("user123");
        user.setUsertype("user");
        userservice.userSignup(user);
        userservice.userSignup(user);
        
        Company company = new Company();
        company.setBoardOfDirectors("John, Jonathan, Steve");
        company.setBriefWriteup("Company establihed decades ago, concentrating on Financial Domain");
        company.setCeo("Jonathan");
        company.setCompanystockCode("STK01000");
        company.setCompanyName("ABC Pvt Ltd");
        company.setisactive("Active");
        company.setListedStockExchange("BSE");
        company.setSector("Financial");
        company.setTurnover(1230000.67);
        boolean result = true;
        adminservice.addCompany(company, 1);
        if(adminservice.getCompany(1).getCompanyName().equals("ABC Pvt Ltd"))
        		result = false;
        Assert.assertEquals(true, result);
        	
	}

}

package com.stock.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
import com.stock.hibernet.model.User;
import com.stock.hibernet.service.AdminService;
import com.stock.hibernet.service.UserService;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestFunctional extends TestCase {

	@Test
	public void testCreateCompany() {
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("stock-application.xml");
	        AdminService adminservice = (AdminService) context.getBean("adminService");
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
	        adminservice.addCompany(company, 1);
	        Assert.assertEquals(adminservice.getCompany(1).getCompanyName(), "ABC Pvt Ltd");
	}
	
	@Test
	public void testDeactivateCompany() {
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("stock-application.xml");
	        AdminService adminservice = (AdminService) context.getBean("adminService");
	        
	        boolean result = adminservice.deactivateCompany(1);
	        Assert.assertEquals(true,result);
	}
	
	@Test
	public void testUpdateIPO() {
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("stock-application.xml");
	        AdminService adminservice = (AdminService) context.getBean("adminService");
	        IPO ipo = new IPO();
	        ipo.setCompanyCode("STK01000");
	        ipo.setNumberofshares(1000);
	        ipo.setOpendatetime("2020/02/10 11:00:00");
	        ipo.setPricepershare(200);
	        ipo.setRemarks("Updating information");
	        ipo.setStockexchange(300.00);
	        boolean result = adminservice.updateIPO(ipo, 1);
	        Assert.assertEquals(true,result);
	}
	@Test
	public void testCreateCUser() {
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("stock-application.xml");
	        UserService userservice = (UserService) context.getBean("userService");
	        User user = new User();
	        user.setConfirmed("Yes");
	        user.setEmail("user@test.com");
	        user.setMobilenumber("9900990099");
	        user.setPassword("user@1234");
	        user.setUsername("user123");
	        user.setUsertype("user");
	        userservice.userSignup(user);
	        Assert.assertEquals(userservice.getUser(1).getEmail(), "user@test.com");
	}
	@Test
	public void testUpdateUser() {
		 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("stock-application.xml");
	        UserService userservice = (UserService) context.getBean("userService");
	        User user = new User();
	        user.setConfirmed("Yes");
	        user.setEmail("user@test.com");
	        user.setMobilenumber("9900990099");
	        user.setPassword("user@1234");
	        user.setUsername("user123");
	        user.setUsertype("user");
	        userservice.userSignup(user);
	        user.setMobilenumber("9988998800");
	        boolean result = userservice.userUpdate(user, 1);
	        Assert.assertEquals(true, result);
	}
	
	
}

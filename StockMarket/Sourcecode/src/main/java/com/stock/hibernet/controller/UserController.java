package com.stock.hibernet.controller;

import java.util.List;

import com.stock.hibernet.dao.UserServiceImpl;
import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
import com.stock.hibernet.model.StockPriceEntity;
import com.stock.hibernet.model.User;
import com.stock.hibernet.service.UserService;

public class UserController {
	
	private UserService userservice;
	
	  public boolean userSignup(User user) {
		  userservice = new UserServiceImpl();
		  return userservice.userSignup(user);
	  }
	  
	  public boolean userUpdate(User user, int userid) {
		  userservice = new UserServiceImpl();
		  return userservice.userUpdate(user, userid);

	  }
	  public Company searchCompany(String companyname) {
		  userservice = new UserServiceImpl();
		  return userservice.searchCompany(companyname);

	  }
	  public StockPriceEntity getDetails(String fromdate, String todate, char options) {
		  userservice = new UserServiceImpl();
		  return userservice.getDetails(fromdate, todate, options);

	  }
	  public List<IPO> viewIPO() {
		  userservice = new UserServiceImpl();
		  return userservice.viewIPO();

	  }




}

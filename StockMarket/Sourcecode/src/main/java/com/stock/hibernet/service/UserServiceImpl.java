package com.stock.hibernet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.hibernet.dao.UserDao;
import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
import com.stock.hibernet.model.StockPriceEntity;
import com.stock.hibernet.model.User;
@Component
@Service ("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userdao;
	
	@Transactional
	public boolean userSignup(User user) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public boolean userUpdate(User user, int userid) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional
	public Company searchCompany(String companyname) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public StockPriceEntity getDetails(String fromdate, String todate, char options) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	public List<IPO> viewIPO() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional

	public User getUser(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.stock.hibernet.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
import com.stock.hibernet.model.StockPriceEntity;
import com.stock.hibernet.model.User;
@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory sessionfactory;
	public boolean userSignup(User user) {
		// TODO Auto-generated method stub
		return true;

	}

	public boolean userUpdate(User user, int userid) {
		// TODO Auto-generated method stub
		return true;

	}

	public Company searchCompany(String companyname) {
		// TODO Auto-generated method stub
		return null;
	}

	public StockPriceEntity getDetails(String fromdate, String todate, char options) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IPO> viewIPO() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

}

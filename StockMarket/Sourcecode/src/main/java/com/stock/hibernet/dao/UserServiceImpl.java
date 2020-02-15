package com.stock.hibernet.dao;

import java.util.List;

import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
import com.stock.hibernet.model.StockPriceEntity;
import com.stock.hibernet.model.User;
import com.stock.hibernet.service.UserService;

public class UserServiceImpl implements UserService {

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

}

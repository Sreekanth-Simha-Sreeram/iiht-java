package com.stock.hibernet.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stock.hibernet.dao.AdminDaoImpl;
import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
import com.stock.hibernet.service.AdminService;

public class AdminController {
	/*@Autowired
	private AdminService adminservice;
	
	public List<Company> listAllCompany() {
		adminservice = new AdminDaoImpl();
		return adminservice.listAllCompany();
	}
	
	public boolean addCompany(Company company) {
		adminservice = new AdminDaoImpl();
		return adminservice.addCompany(company);
	}

	public boolean updateIPO(IPO ipo, int ipo_id) {
		adminservice = new AdminDaoImpl();
		return adminservice.updateIPO(ipo, ipo_id);
	}
	public boolean deactivateCompany(int companyid) {
		adminservice = new AdminDaoImpl();
		return adminservice.deactivateCompany(companyid);

	}*/



}

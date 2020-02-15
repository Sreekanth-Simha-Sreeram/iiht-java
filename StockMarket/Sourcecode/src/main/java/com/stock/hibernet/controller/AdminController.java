package com.stock.hibernet.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.stock.hibernet.dao.AdminServiceImpl;
import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
import com.stock.hibernet.service.AdminService;
public class AdminController {
	@Autowired
	private AdminService adminservice;
	
	public List<Company> listAllCompany() {
		adminservice = new AdminServiceImpl();
		return adminservice.listAllCompany();
	}
	
	public boolean addCompany(Company company) {
		adminservice = new AdminServiceImpl();
		return adminservice.addCompany(company);
	}

	public boolean updateIPO(IPO ipo, int ipo_id) {
		adminservice = new AdminServiceImpl();
		return adminservice.updateIPO(ipo, ipo_id);
	}
	public boolean deactivateCompany(int companyid) {
		adminservice = new AdminServiceImpl();
		return adminservice.deactivateCompany(companyid);

	}



}

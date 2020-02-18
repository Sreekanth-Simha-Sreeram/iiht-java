package com.stock.hibernet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

import com.stock.hibernet.dao.AdminDao;
import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
@Component
@Service ("adminService")
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao adminDao;
	@Transactional
	public List<Company> listAllCompany() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional

	public void addCompany(Company company, int userid) {
		// TODO Auto-generated method stub
		 adminDao.addCompany(company, userid);
	}
	@Transactional

	public boolean deactivateCompany(int companyid) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional

	public boolean updateIPO(IPO ipo, int ipo_id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Transactional

	public void uploadFile(String filename, int companyId, String fromdate, String todate) {
		// TODO Auto-generated method stub

	}
	@Transactional
	public Company getCompany(int companyid) {
		// TODO Auto-generated method stub
		return (Company)adminDao.getCompany(companyid);
	}

}

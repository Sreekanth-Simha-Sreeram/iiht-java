package com.stock.hibernet.dao;

import java.util.List;
import java.util.logging.Logger;

import org.hibernate.SessionFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
@Component
@SuppressWarnings("deprecation")
public class AdminDaoImpl  implements AdminDao {
	@Autowired
	private SessionFactory sessionfactory;
	//private SessionFactory sessionfactory;
	
//	public void setSessionFactory(SessionFactory sf){
//		//this.sessionfactory = sf;
//	}
	public List<Company> listAllCompany() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addCompany(Company company, int userid) {
		//sessionfactory.get
		sessionfactory.getCurrentSession().persist(company);
		
		//Session session = this.sessionfactory.
		//return true;
	}

	public boolean deactivateCompany(int companyid) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateIPO(IPO ipo, int ipo_id) {
		// TODO Auto-generated method stub
		return false;
	}

	public void uploadFile(String filename, int companyId, String fromdate, String todate) {
		// TODO Auto-generated method stub

	}

	public Company getCompany(int companyid) {
		// TODO Auto-generated method stub
		return (Company) sessionfactory.getCurrentSession().get(Company.class, companyid);
	}

}

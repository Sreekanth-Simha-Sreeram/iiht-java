package com.stock.hibernet.service;
import java.util.List;
import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
public interface AdminService
{
		public List<Company> listAllCompany();
		
		public boolean addCompany(Company company);
		
		public boolean deactivateCompany(int companyid);
		
		public boolean updateIPO(IPO ipo, int ipo_id);
		
		public void uploadFile(String filename, int companyId, String fromdate, String todate);
		
}

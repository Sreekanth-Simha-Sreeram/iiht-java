package com.stock.hibernet.application;
import java.util.List;

import com.stock.hibernet.controller.AdminController;
import com.stock.hibernet.controller.UserController;
import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
import com.stock.hibernet.model.User;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class FunctionalTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	 
	AdminController adminTest = new AdminController();
	UserController userTest = new UserController() {
		
		
	}; 
	// Testing to return whether item is present in the list or not
	public void testcompanyList() {
		List<Company> pList =  adminTest.listAllCompany();
		String result = "";
		if(!pList.isEmpty()) {
			result = "Contains List Items";
		}
		assertEquals(result, "Contains List Items");
	}
	
	public void testCreateCompany() {
		Company company = new Company();
		company.setBoardOfDirectors("John Doe");
		company.setBriefWriteup("Into Venture Capitalist and Investments");
		company.setCeo("Jonathan");
		company.setCompanyName("Java Spring Hibernate Pvt Ltd");
		company.setCompanystockCode("C001");
		company.setListedStockExchange("BSE");
		company.setSector("sectorA");
		company.setTurnover(2000000.89);
		company.setId(10);
	    adminTest.addCompany(company);
		
		Company testResult = new Company();
				
		testResult = userTest.searchCompany("Java Spring Hibernate Pvt Ltd");
		
		assertEquals(testResult.getCompanyName(), "Java Spring Hibernate Pvt Ltd");
	}
	
	public void testCompanyDeactivate() {
		adminTest.deactivateCompany(10);
		Company companyResult = new Company();
		companyResult = userTest.searchCompany("Java Spring Hibernate Pvt Ltd");
		assertEquals(companyResult.getisactive(), "yes");
		
	}
	public void testUserSignup() {
		User user = new User();
		user.setConfirmed("yes");
		user.setEmail("user@stock.com");
		user.setMobilenumber("9900990099");
		user.setPassword("user@1234");
		user.setUsername("stock user");
		user.setUsertype("user");
		boolean result = userTest.userSignup(user);
		assertEquals(result, true);
	}
	
	public void testIPOList() {
		List<IPO> pList =  userTest.viewIPO();
		String result = "";
		if(!pList.isEmpty()) {
			result = "Contains List Items";
		}
		assertEquals(result, "Contains List Items");
	}
	public void testUpdateIPO() {
		IPO ipo = new IPO();
		ipo.setNumberofshares(1000);
		boolean result = adminTest.updateIPO(ipo, 10);
		assertEquals(result, true);
	}
	public FunctionalTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( FunctionalTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}

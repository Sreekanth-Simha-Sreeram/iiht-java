package com.emart.hibernet.application;

import java.util.List;

import com.emart.hibernet.controller.EmartController;
import com.emart.hibernet.model.Emart;

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
	 
	EmartController emartTest = new EmartController();
	// Testing to return whether item is present in the list or not
	public void testProductList() {
		List<Emart> pList =  emartTest.getAllItems();
		String result = "";
		if(!pList.isEmpty()) {
			result = "Contains List Items";
		}
		assertEquals(result, "Contains List Items");
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

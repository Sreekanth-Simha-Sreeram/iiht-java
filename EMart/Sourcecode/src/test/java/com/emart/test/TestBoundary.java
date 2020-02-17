package com.emart.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emart.hibernet.model.Seller;
import com.emart.hibernet.service.SellerService;

public class TestBoundary {
	/*GST number length must equal to 15*/
	@Test
	public void testGSTLength() {
		Seller seller = new Seller();
		seller.setSellerName("ABC Retails Pvt Ltd");
		seller.setSellerEmail("buyer@gmail.com");
		seller.setSellerPassword("pass123");
		seller.setSellerContact("9900990088");
		seller.setSellerAddress("No 12 6th main Bangalore 560001");
		seller.setSellerGST("29ABCDE1234F2Z5");
		seller.setSellerId(112);
		int gstLenght = 15;
		Assert.assertEquals(gstLenght, seller.getSellerGST().length());
		
	}

}

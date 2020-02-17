package com.emart.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.mapping.Array;
import org.junit.Test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.emart.hibernet.model.Buyer;
import com.emart.hibernet.model.Product;
import com.emart.hibernet.model.Seller;
import com.emart.hibernet.model.Stock;
import com.emart.hibernet.service.BuyerService;
import com.emart.hibernet.service.SellerService;

import junit.framework.Assert;
import junit.framework.TestCase;

public class TestFunctional extends TestCase {
	
	/*Testing buyer creation*/

	@Test
	public void testCreateBuyer() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("emart-application.xml");
		Buyer buyer = new Buyer();
		buyer.setBuyerName("Suresh");
		buyer.setBuyerEmail("buyer@gmail.com");
		buyer.setBuyerPassword("pass123");
		buyer.setBuyerPhone("9900990088");
		BuyerService buyerservice = (BuyerService) context.getBean("buyerService");
		buyerservice.createBuyer(buyer);
		buyer = buyerservice.findBuyer(1);
		Assert.assertEquals(buyerservice.findBuyer(1).getBuyerName(), "Suresh");
	}
	
	/*Testing buyer searching product*/

	@Test
	
	public void testSearchProducts() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("emart-application.xml");
		Product product = new Product();
		product.setProductId(111);
		product.setProductName("HP Pavillion");
		product.setProductPrice(150);
		product.setProductType("Fruit");
		product.setCategory("Electronics");
		product.setSubcategory("Laptop");
		BuyerService buyerservice = (BuyerService) context.getBean("buyerService");
		List products = buyerservice.searchProducts("HP Pavillion", "Electronics", "Laptop");
		Assert.assertNotNull(products);
	}
	
	/*Testing buyer adding product to cart*/

	@Test
	public void testaddCart() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("emart-application.xml");
		Product product = new Product();
		product.setProductId(111);
		product.setProductName("HP Pavillion");
		product.setProductPrice(35000);
		product.setProductType("Electronics");
		product.setCategory("Laptops");
		product.setSubcategory("HP");
		List <Product> newList = new ArrayList<Product>();
		newList.add(product);
		BuyerService buyerservice = (BuyerService) context.getBean("buyerService");
		buyerservice.addToCart(newList, 111);
		List orderList = buyerservice.viewCart(111);
		Assert.assertNotNull(orderList);
	}
	
	/*Testing seller creation*/

	@Test
	public void testCreateSeller() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("emart-application.xml");
		Seller seller = new Seller();
		seller.setSellerName("ABC Retails Pvt Ltd");
		seller.setSellerEmail("buyer@gmail.com");
		seller.setSellerPassword("pass123");
		seller.setSellerContact("9900990088");
		seller.setSellerAddress("No 12 6th main Bangalore 560001");
		seller.setSellerGST("29ABCDE1234F2Z5");
		seller.setSellerId(112);
		
		SellerService sellerservice = (SellerService) context.getBean("sellerService");
		sellerservice.createSeller(seller);
		
		Assert.assertEquals(sellerservice.findSeller(112).getSellerName(), "ABC Retails Pvt Ltd");		//Assert.assertEquals(buyerservice.findBuyer(1).getBuyerName(), "Suresh");
	}
	
	/*Testing seller adding product to stock*/
	@Test
	public void testAddStock() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("emart-application.xml");
		Product product = new Product();
		product.setProductId(111);
		product.setProductName("HP Pavillion");
		product.setProductPrice(35000);
		product.setProductType("Electronics");
		product.setCategory("Laptops");
		product.setSubcategory("HP");
		Stock stock = new Stock();
		stock.setStockId(111);
		stock.setStockQuantity(100);
		stock.setUom("Nos");
		SellerService sellerservice = (SellerService) context.getBean("sellerService");
		sellerservice.addStock(product, 112, stock);
		List productList = sellerservice.viewProduct(112);
		Assert.assertNotNull(productList);

	}

}

package com.emart.hibernet.dao;

import java.util.List;

import com.emart.hibernet.model.Buyer;
import com.emart.hibernet.model.Product;
import com.emart.hibernet.service.BuyerService;

public class BuyerServiceImpl implements BuyerService {

	public List<Product> searchProducts(String productName, String productCategory, String productSubcategory) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addToCart(List<Product> product, int buyerId) {
		// TODO Auto-generated method stub
		return true;

	}

	public List<Product> filterProducts(String productName, int price, String productCategory,
			String productSubcategory) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteFromCart(List<Product> product) {
		// TODO Auto-generated method stub

	}

	public void viewCart(List<Product> product, int buyerId) {
		// TODO Auto-generated method stub

	}

	public void placeOrder(List<Product> product, Buyer buyer) {
		// TODO Auto-generated method stub

	}

}

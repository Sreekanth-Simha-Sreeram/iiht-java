package com.emart.hibernet.service;
import com.emart.hibernet.model.Product;
import com.emart.hibernet.model.Buyer;
import java.util.List;
import java.util.ArrayList;
public interface BuyerService
{
		public List<Product> searchProducts(String productName,String productCategory,String productSubcategory);
		
		public boolean addToCart(List<Product>product,int buyerId);
		
		public List<Product> filterProducts(String productName,int price,String productCategory,String productSubcategory);
		
		public void deleteFromCart(List<Product>product);
		
		public void viewCart(List<Product>product,int buyerId);
		
		public void placeOrder(List<Product>product,Buyer buyer);
}

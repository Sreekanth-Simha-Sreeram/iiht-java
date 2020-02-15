package com.emart.hibernet.service;
import com.emart.hibernet.model.Product;
import com.emart.hibernet.model.Seller;
import com.emart.hibernet.model.Stock;

import java.util.List;


public interface SellerService 
{
  public void addStock(Product product,Seller seller,int stockQuantity);
  
  public List<Stock> viewSaleInventory(int sellerId);

}

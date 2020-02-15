package com.stock.hibernet.service;
import java.util.List;

import com.stock.hibernet.model.Company;
import com.stock.hibernet.model.IPO;
import com.stock.hibernet.model.StockPriceEntity;
import com.stock.hibernet.model.User;


public interface UserService 
{
  public boolean userSignup(User user);
  
  public boolean userUpdate(User user, int userid);
  
  public Company searchCompany(String companyname);
  
  public StockPriceEntity getDetails(String fromdate, String todate, char options);
  
  public List<IPO> viewIPO();

}

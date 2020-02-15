package com.stock.hibernet.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockpriceentity")
public class StockPriceEntity {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="companyCode")
	String companyCode;
	
	@Column(name="stockexchange")
	double stockexchange;
	
	@Column(name="currentprice")
	double currentprice;
	
	@Column(name="date")
	String date;
	
	@Column(name="time")
	String time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public double getStockexchange() {
		return stockexchange;
	}

	public void setStockexchange(double stockexchange) {
		this.stockexchange = stockexchange;
	}

	public double getCurrentprice() {
		return currentprice;
	}

	public void setCurrentprice(double currentprice) {
		this.currentprice = currentprice;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
}

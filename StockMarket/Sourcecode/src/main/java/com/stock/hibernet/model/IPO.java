package com.stock.hibernet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="IPO")
public class IPO {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="companyCode")
	String companyCode;
	
	@Column(name="stockexchange")
	double stockexchange;
	
	@Column(name="pricepershare")
	double pricepershare;
	
	@Column(name="numberofshares")
	int numberofshares;
	
	@Column(name="opendatetime")
	String opendatetime;
	
	@Column(name="remarks")
	String remarks;

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

	public double getPricepershare() {
		return pricepershare;
	}

	public void setPricepershare(double pricepershare) {
		this.pricepershare = pricepershare;
	}

	public int getNumberofshares() {
		return numberofshares;
	}

	public void setNumberofshares(int numberofshares) {
		this.numberofshares = numberofshares;
	}

	public String getOpendatetime() {
		return opendatetime;
	}

	public void setOpendatetime(String opendatetime) {
		this.opendatetime = opendatetime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	

}

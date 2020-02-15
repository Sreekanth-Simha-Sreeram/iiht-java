package com.stock.hibernet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Company")
public class Company {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	
	@Column(name="companyName")
	String companyName;
	
	@Column(name="turnover")
	double turnover;
	
	@Column(name="ceo")
	String ceo;
	
	@Column(name="boardOfDirectors")
	String boardOfDirectors;
	
	@Column(name="listedStockExchange")
	String listedStockExchange;
	
	@Column(name="sector")
	String sector;
	
	@Column(name="briefWriteup")
	String briefWriteup;
	
	@Column(name="companystockCode")
	String companystockCode;
	
	@Column(name="isactive")
	String isactive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getTurnover() {
		return turnover;
	}

	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public String getListedStockExchange() {
		return listedStockExchange;
	}

	public void setListedStockExchange(String listedStockExchange) {
		this.listedStockExchange = listedStockExchange;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getBriefWriteup() {
		return briefWriteup;
	}

	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

	public String getCompanystockCode() {
		return companystockCode;
	}

	public void setCompanystockCode(String companystockCode) {
		this.companystockCode = companystockCode;
	}
	
	public String getisactive() {
		return isactive;
	}

	public void setisactive(String isactive) {
		this.isactive = isactive;
	}

}

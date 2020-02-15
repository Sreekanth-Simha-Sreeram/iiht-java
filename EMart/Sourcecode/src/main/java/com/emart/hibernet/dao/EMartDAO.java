package com.emart.hibernet.dao;

import java.util.List;

import com.emart.hibernet.model.Emart;


public interface EMartDAO {
	public String addItem(Emart std);
	public Emart getItem(int Id);
	public List<Emart> getAllItems();
}

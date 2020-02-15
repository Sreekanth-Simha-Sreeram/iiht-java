package com.emart.hibernet.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emart.hibernet.model.Emart;

@Repository
public abstract class EmartDAOImpl implements EMartDAO{
	@Autowired
	private SessionFactory sessionFactory ;
	


	public String addItem1(Emart std) {
		// TODO Auto-generated method stub
		return null;
	}

	public Emart getItem1(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<Emart> getAllItem() {
		
		return null;
		
	}

	public String addItem(Emart std) {
		// TODO Auto-generated method stub
		return null;
	}

	public Emart getItem(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

}

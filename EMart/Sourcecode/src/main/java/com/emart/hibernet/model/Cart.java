package com.emart.hibernet.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name="Cart")
public class Cart {
	private List<Product> listOfItems = new ArrayList<Product>();

}

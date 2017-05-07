package com.ubs.checkout.model;

import java.util.List;
import java.util.Map;

public class Cart {
	
	Map<String, List<Product>> products;
	
	public Map<String, List<Product>> getProducts() {
		return products;
	}

	public void setProducts(Map<String, List<Product>> products) {
		this.products = products;
	}

	public void mapListOfProducts(List<Product> listOfProducts) {
		
	}

}

package com.ubs.checkout.model;

import java.math.BigDecimal;

public class Product {
	
	private String code;
	private String name;
	private BigDecimal unitPrice;
	
	
	public String getCode() {
		return code;
	}
	
	public String getName() {
		return name;
	}
	
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public Product withCode(String code) {
		setCode(code);
		return this;
	}
	
	public Product withName(String name) {
		setName(name);
		return this;
	}
	
	public Product withUnitPrice(BigDecimal unitPrice) {
		setUnitPrice(unitPrice);
		return this;
	}

}

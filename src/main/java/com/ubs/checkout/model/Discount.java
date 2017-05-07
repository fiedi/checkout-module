package com.ubs.checkout.model;

import java.math.BigDecimal;

public class Discount {
	
	private Product product;
	private Integer quantity;
	private BigDecimal discountedPrice;
	
	public Product getProduct() {
		return product;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public BigDecimal getDiscountedPrice() {
		return discountedPrice;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public void setDiscountedPrice(BigDecimal discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	
	public Discount withProduct(Product product) {
		setProduct(product);
		return this;
	}
	
	public Discount withQuantity(Integer quantity) {
		setQuantity(quantity);
		return this;
	}
	
	public Discount withDiscountedPrice(BigDecimal discountedPrice) {
		setDiscountedPrice(discountedPrice);
		return this;
	}

	
}

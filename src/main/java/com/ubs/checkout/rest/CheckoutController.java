package com.ubs.checkout.rest;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ubs.checkout.model.Product;
import com.ubs.checkout.services.CheckoutService;

@Controller
@RequestMapping("/REST/checkout")
public class CheckoutController {
	
	@Autowired
	CheckoutService checkoutService;
	
		@RequestMapping(value = "/cart", method = RequestMethod.POST, consumes = { "application/json", "application/xml" }, produces = {
	            "application/json", "application/xml" })
	    @ResponseBody
	    public BigDecimal getTotalPriceFromCart(@RequestBody List<Product> products) {
	        return checkoutService.getTotalPrice(products);
	    }
		
		@RequestMapping(value = "/unitPrice", method = RequestMethod.POST, consumes = { "application/json", "application/xml" }, produces = {
	            "application/json", "application/xml" })
	    @ResponseBody
	    public BigDecimal getUnitPriceOfProduct(@RequestBody Product product) {
	        return checkoutService.getUnitPriceOfProduct(product);
	    }

}

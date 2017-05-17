package com.ubs.checkout.services.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ubs.checkout.model.Product;
import com.ubs.checkout.services.CheckoutService;

@Service
public class CheckoutServiceImpl implements CheckoutService {

    public BigDecimal getTotalPrice(List<Product> products) {
        return null;
    }

    public BigDecimal getUnitPriceOfProduct(Product product) {
        return null;
    }

}

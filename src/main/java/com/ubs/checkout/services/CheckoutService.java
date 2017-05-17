package com.ubs.checkout.services;

import java.math.BigDecimal;
import java.util.List;

import com.ubs.checkout.model.Product;

public interface CheckoutService {

    BigDecimal getTotalPrice(List<Product> products);

    BigDecimal getUnitPriceOfProduct(Product product);

}

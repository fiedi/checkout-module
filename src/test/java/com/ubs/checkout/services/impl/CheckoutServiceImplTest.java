package com.ubs.checkout.services.impl;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import com.ubs.checkout.model.Product;

@RunWith(MockitoJUnitRunner.class)
public class CheckoutServiceImplTest {

    private static String TEST_CODE_PREFIX = "test_code_prefix";
    private static String TEST_NAME_PREFIX = "test_name_prefix";
    private static Integer TEST_UNIT_PRICE = 3;

    @InjectMocks
    private CheckoutServiceImpl checkoutService;

    @Test(expected = Exception.class)
    public void getTotalPriceForNullProductsShouldReturnExceptionTest() throws Exception {
        checkoutService.getTotalPrice(null);
    }

    @Test
    public void getTotalPriceForEmptyListShouldTest() throws Exception {
        checkoutService.getTotalPrice(new ArrayList<Product>());
    }

    @Test
    public void getTotalPriceWithProductListShouldReturnTotalPriceTest() throws Exception {
        BigDecimal expectedValue = new BigDecimal(5);
        List<Product> testProductList = new ArrayList<Product>();

        for (int i = 0; i < 3; i++) {
            testProductList.add(createValidProduct(i));
        }

        BigDecimal returnedValue = checkoutService.getTotalPrice(testProductList);
        assertThat(returnedValue).isNotNull();
        assertThat(returnedValue).isEqualTo(expectedValue);
    }

    private Product createValidProduct(Integer suffix) {
        return new Product()//
                .withCode(TEST_CODE_PREFIX + suffix)//
                .withName(TEST_NAME_PREFIX + suffix)//
                .withUnitPrice(new BigDecimal(TEST_UNIT_PRICE + suffix))//
        ;
    }

}

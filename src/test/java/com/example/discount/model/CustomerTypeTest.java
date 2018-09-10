package com.example.discount.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by khaja on 9/10/2018.
 */
public class CustomerTypeTest {
    @Test
    public void testGetDiscount_returnsDiscountPercentage() throws Exception {
        Assert.assertTrue(CustomerType.STORE_EMPLOYEE.getDiscount() == 30);
    }

}
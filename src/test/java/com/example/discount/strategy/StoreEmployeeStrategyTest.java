package com.example.discount.strategy;

import com.example.discount.TestContext;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by khaja on 9/10/2018.
 */
public class StoreEmployeeStrategyTest {
    @Test
    public void testGetDiscountedAmount_returnsEmployeeDiscountedBill() throws Exception {
        final DiscountStrategy discountStrategy = new StoreEmployeeStrategy();
        final double amount = discountStrategy.getDiscountedAmount(TestContext.EMPLOYEE_BILL);
        Assert.assertTrue("Apply employee dicount", amount > 0);
    }

}
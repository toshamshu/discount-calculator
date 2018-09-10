package com.example.discount.strategy;

import com.example.discount.TestContext;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by khaja on 9/10/2018.
 */
public class HistoricalCustomerStrategyTest {
    @Test
    public void testGetDiscountedAmount() throws Exception {
        final DiscountStrategy discountStrategy = new HistoricalCustomerStrategy();
        final double amount = discountStrategy.getDiscountedAmount(TestContext.HISTORICAL_CUSTOMER_BILL);
        Assert.assertTrue("Apply history based dicount", amount > 0);

    }

}
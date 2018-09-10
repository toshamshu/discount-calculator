package com.example.discount.strategy;

import com.example.discount.TestContext;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by khaja on 9/10/2018.
 */
public class StoreAffiliatesStrategyTest {
    @Test
    public void testGetDiscountedAmount() throws Exception {
        final DiscountStrategy discountStrategy = new StoreAffiliatesStrategy();
        final double amount = discountStrategy.getDiscountedAmount(TestContext.AFFILIATE_BILL);
        Assert.assertTrue("Apply affiliate dicount", amount > 0);
    }

}
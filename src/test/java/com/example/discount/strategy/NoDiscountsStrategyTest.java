package com.example.discount.strategy;

import com.example.discount.TestContext;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by khaja on 9/10/2018.
 */
public class NoDiscountsStrategyTest {
    @Test
    public void testGetDiscountedAmount_withAnyInput_noDiscountApplied() throws Exception {
        final DiscountStrategy discountStrategy = new NoDiscountsStrategy();
        final double amount = discountStrategy.getDiscountedAmount(TestContext.EMPLOYEE_BILL);
        final double expectedAmount = TestContext.EMPLOYEE_BILL.getGroceriesTotalAmount() + TestContext.EMPLOYEE_BILL.getNonGroceriesTotalAmount();
        Assert.assertTrue("No discount should by applied", expectedAmount == amount);


    }

}
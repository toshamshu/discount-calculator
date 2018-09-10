package com.example.discount.strategy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by khaja on 9/10/2018.
 */
public class FinalAmountBasedDiscountTest {
    @Test
    public void testGetFinalBill_returnsDiscountOfFiveDollarForEachHundred() throws Exception {
        double amount = 990;
        final FinalAmountBasedDiscount finalAmountBasedDiscount = new FinalAmountBasedDiscount();
        final double finalDicountedAmount = finalAmountBasedDiscount.getFinalBill(amount);
        final double expectedDiscount = amount-45;
        assertTrue("Final discount of $5 for each 100 should be applied",expectedDiscount== finalDicountedAmount);
    }

    @Test
    public void testGetFinalBill_withNegativeAmount_returnsZero() throws Exception {
        double amount = -10;
        final FinalAmountBasedDiscount finalAmountBasedDiscount = new FinalAmountBasedDiscount();
        final double finalDicountedAmount = finalAmountBasedDiscount.getFinalBill(amount);
        assertTrue("Final discount of $5 for each 100 should be applied",0 == finalDicountedAmount);
    }

}
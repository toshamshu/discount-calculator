package com.example.discount.model;

import com.example.discount.TestContext;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by khaja on 9/10/2018.
 */
public class BillTest {
    @Test
    public void testGetPayableAmount() throws Exception {
        final Bill bill = TestContext.EMPLOYEE_BILL;
        final double finalDiscountedAmount = bill.getPayableAmount();
        final double actualBill = bill.getGroceriesTotalAmount() + bill.getNonGroceriesTotalAmount();
        Assert.assertTrue("Dicount must be applied",finalDiscountedAmount < actualBill);
    }

}
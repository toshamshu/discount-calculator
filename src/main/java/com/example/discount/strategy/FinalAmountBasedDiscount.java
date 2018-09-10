package com.example.discount.strategy;

import com.example.discount.model.Bill;

/**
 * Created by khaja on 9/8/2018.
 */
public class FinalAmountBasedDiscount {

    private static final int DISCOUNT_FOR_EACH_HUNDRED = 5;

    public Double getFinalBill(final double amount) {
        return applyFinalDiscount(amount);
    }

    private Double applyFinalDiscount(double discountedBillAmount) {
        final double finalAmount;
        if (discountedBillAmount > 0) {
            final int amountInHundreds = Double.valueOf(discountedBillAmount/100).intValue();
             finalAmount = discountedBillAmount - amountInHundreds * DISCOUNT_FOR_EACH_HUNDRED;
        }
        else {
            finalAmount = 0;
        }
        return finalAmount;
    }
}

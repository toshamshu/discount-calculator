package com.example.discount.strategy;

import com.example.discount.model.Bill;

import static com.example.discount.model.CustomerType.STORE_AFFILIATE;

/**
 * Created by khaja on 9/8/2018.
 */
public class StoreAffiliatesStrategy extends PercentageBasedDiscountStrategy {
    @Override
    public Double getDiscountedAmount(Bill bill) {
        final double nonGroceriesTotalAmount = bill.getNonGroceriesTotalAmount();
        final double nonGroceryAmountAfterDiscount = calculateDiscount(nonGroceriesTotalAmount, STORE_AFFILIATE.getDiscount());
        final double netAmount = bill.getGroceriesTotalAmount() + nonGroceryAmountAfterDiscount;
        return netAmount;
    }
}

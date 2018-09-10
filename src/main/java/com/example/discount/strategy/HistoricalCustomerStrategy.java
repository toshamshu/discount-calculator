package com.example.discount.strategy;

import com.example.discount.model.Bill;

import static com.example.discount.model.CustomerType.HISTORICAL_CUSTOMER;

/**
 * Created by khaja on 9/8/2018.
 */
public class HistoricalCustomerStrategy extends PercentageBasedDiscountStrategy {
    @Override
    public Double getDiscountedAmount(final Bill bill) {
        final double nonGroceriesTotalAmount = bill.getNonGroceriesTotalAmount();
        final double nonGroceryAmountAfterDiscount = calculateDiscount(nonGroceriesTotalAmount, HISTORICAL_CUSTOMER.getDiscount());
        final double netAmount = bill.getGroceriesTotalAmount() + nonGroceryAmountAfterDiscount;
        return netAmount;
    }
}

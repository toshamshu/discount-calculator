package com.example.discount.strategy;

import com.example.discount.model.Bill;

/**
 * Created by khaja on 9/10/2018.
 */
public class NoDiscountsStrategy implements DiscountStrategy {
    @Override
    public Double getDiscountedAmount(final Bill bill) {
        return bill.getGroceriesTotalAmount() + bill.getNonGroceriesTotalAmount();
    }
}

package com.example.discount.strategy;

import com.example.discount.model.Bill;

import static com.example.discount.model.CustomerType.STORE_EMPLOYEE;

/**
 * Created by khaja on 9/8/2018.
 */
public class StoreEmployeeStrategy extends PercentageBasedDiscountStrategy {
    @Override
    public Double getDiscountedAmount(Bill bill) {
        final double nonGroceriesTotalAmount = bill.getNonGroceriesTotalAmount();
        final double nonGroceryDiscountedAmount = calculateDiscount(nonGroceriesTotalAmount, STORE_EMPLOYEE.getDiscount());
        final double netAmount = bill.getGroceriesTotalAmount() + nonGroceryDiscountedAmount;
        return netAmount;
    }
}

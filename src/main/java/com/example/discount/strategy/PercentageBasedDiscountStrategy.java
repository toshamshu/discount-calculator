package com.example.discount.strategy;

import com.example.discount.model.Bill;
import com.example.discount.model.CustomerType;

/**
 * Created by khaja on 9/8/2018.
 */
public abstract class PercentageBasedDiscountStrategy implements DiscountStrategy {


    public Double calculateDiscount(double amount, double discountPercentage) {
        return  (amount - (amount * (discountPercentage / 100)));
    }
}

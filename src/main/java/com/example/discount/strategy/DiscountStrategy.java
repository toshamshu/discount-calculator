package com.example.discount.strategy;

import com.example.discount.model.Bill;

/**
 * Created by khaja on 9/8/2018.
 */
public interface DiscountStrategy {
    Double getDiscountedAmount(Bill bill);
}

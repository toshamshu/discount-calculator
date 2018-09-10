package com.example.discount.model;

import com.example.discount.strategy.DiscountStrategy;

/**
 * Created by khaja on 9/8/2018.
 */
public enum CustomerType {
    STORE_EMPLOYEE(30.0),
    STORE_AFFILIATE(10.0),
    HISTORICAL_CUSTOMER(5.0),
    OTHER(0.0);

    private final double discount;
    CustomerType(final double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}

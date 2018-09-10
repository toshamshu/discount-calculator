package com.example.discount.strategy;

import com.example.discount.model.CustomerType;

/**
 * Created by khaja on 9/8/2018.
 */

public class DiscountStrategyFactory {
    public static DiscountStrategy getDiscountStrategy(CustomerType customerType) {
        final DiscountStrategy discountStrategy;
        switch (customerType) {
            case STORE_EMPLOYEE:
                discountStrategy = new StoreEmployeeStrategy();
                break;
            case STORE_AFFILIATE:
                discountStrategy = new StoreAffiliatesStrategy();
                break;
            case HISTORICAL_CUSTOMER:
                discountStrategy = new HistoricalCustomerStrategy();
                break;
            default:
                discountStrategy = new NoDiscountsStrategy();
                break;
        }
        return discountStrategy;
    }
}

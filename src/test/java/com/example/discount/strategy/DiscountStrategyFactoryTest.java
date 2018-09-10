package com.example.discount.strategy;

import com.example.discount.model.CustomerType;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by khaja on 9/10/2018.
 */
public class DiscountStrategyFactoryTest {
    @Test
    public void testGetDiscountStrategy_withCustomerTypeEmployee_returnsStoreEmployeeStrategy() throws Exception {
        final DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(CustomerType.STORE_EMPLOYEE);
        assertTrue("It should return EmployeeDiscount",discountStrategy.getClass().getName().equalsIgnoreCase(StoreEmployeeStrategy.class.getName()));
    }

    @Test
    public void testGetDiscountStrategy_withCustomerTypeAffilate_returnsStoreAffiliateStrategy() throws Exception {
        final DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(CustomerType.STORE_AFFILIATE);
        assertTrue("It should return AffiliateDiscount",discountStrategy.getClass().getName().equalsIgnoreCase(StoreAffiliatesStrategy.class.getName()));
    }
    @Test
    public void testGetDiscountStrategy_withCustomerTypeHistorical_returnsStoreHistoricalStrategy() throws Exception {
        final DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(CustomerType.HISTORICAL_CUSTOMER);
        assertTrue("It should return HistoricalDiscount",discountStrategy.getClass().getName().equalsIgnoreCase(HistoricalCustomerStrategy.class.getName()));
    }
    @Test
    public void testGetDiscountStrategy_withCustomerTypeNull_returnsNoDiscountStrategy() throws Exception {
        final DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(CustomerType.OTHER);
        assertTrue("It should return NoDiscount",discountStrategy.getClass().getName().equalsIgnoreCase(NoDiscountsStrategy.class.getName()));
    }

}
package com.example.discount.model;

import com.example.discount.strategy.DiscountStrategy;
import com.example.discount.strategy.DiscountStrategyFactory;
import com.example.discount.strategy.FinalAmountBasedDiscount;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by khaja on 9/8/2018.
 */
public class Bill {
    private final long id;
    private final Customer customer;
    private final List<Item> items;

    public Bill(long id, Customer customer, List<Item> items) {
        this.id = id;
        this.customer = customer;
        this.items = items;
    }

    public long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Item> getItems() {
        return items;
    }

    public double getPayableAmount() {
        final DiscountStrategy discountStrategy = DiscountStrategyFactory.getDiscountStrategy(customer.getCustomerType());
        final double discountedAmount = discountStrategy.getDiscountedAmount(this);
        final FinalAmountBasedDiscount finalAmountBasedDiscount = new FinalAmountBasedDiscount();
        final double finalPayableBillAmount = finalAmountBasedDiscount.getFinalBill(discountedAmount);
        return finalPayableBillAmount;
    }

    public double getGroceriesTotalAmount() {
        return getItemsCost(findGroceryItems(items));
    }
    public double getNonGroceriesTotalAmount() {
        return getItemsCost(findNonGroceryItems(items));
    }

    private static List<Item> findGroceryItems(final List<Item> items) {
        return items.stream().filter(groceryItems()).collect(Collectors.toList());
    }

    private static List<Item> findNonGroceryItems(final List<Item> items) {
        return items.stream().filter(groceryItems().negate()).collect(Collectors.toList());
    }

    private static Predicate<Item> groceryItems() {
        return item -> ItemType.GROCERY.equals(item.getItemType());
    }
    private static double getItemsCost(List<Item> items) {
        return items.stream().collect(Collectors.summingDouble(item -> item.getCost()));
    }
}

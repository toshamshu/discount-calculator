package com.example.discount;

import com.example.discount.model.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by khaja on 9/10/2018.
 */
public class TestContext {

    public static final Bill EMPLOYEE_BILL = new Bill(1, buildCustomer(1,new Date(),"test name", CustomerType.STORE_EMPLOYEE),buildDummyItems());
    public static final Bill AFFILIATE_BILL = new Bill(2, buildCustomer(2,new Date(),"test name",CustomerType.STORE_AFFILIATE),buildDummyItems());
    public static final Bill HISTORICAL_CUSTOMER_BILL
            = new Bill(3, buildCustomer(3,new Date(),"test name",CustomerType.HISTORICAL_CUSTOMER),buildDummyItems());


    private static Customer buildCustomer(final long id, final Date date, final String name, final CustomerType customerType) {
        final Customer customer = new Customer();
        customer.setId(id);
        customer.setCreatedDate(date);
        customer.setName(name);
        customer.setCustomerType(getCustomerType(date, customerType));
        return customer;
    }

    private static CustomerType getCustomerType(final Date date, final CustomerType customerType) {
        final CustomerType type;
        if (date.before(dateOlderThanTwoYears())) {
            type = CustomerType.HISTORICAL_CUSTOMER;
        }
        else {
            type = customerType;
        }
        return type;
    }

    private static Date dateOlderThanTwoYears() {
        final Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR,-2);
        return calendar.getTime();
    }

    private static List<Item> buildDummyItems() {
        final List<Item> items = new ArrayList<>();
        items.add(new Item(1,"Fan",1200, ItemType.ELECTRONIC));
        items.add(new Item(2,"AC",9990, ItemType.ELECTRONIC));
        items.add(new Item(3,"Fridge",8880, ItemType.ELECTRONIC));
        items.add(new Item(4,"Rice",1200, ItemType.GROCERY));
        items.add(new Item(5,"Dal",150, ItemType.GROCERY));
        items.add(new Item(6,"Sugar",50, ItemType.GROCERY));
        return items;
    }
}

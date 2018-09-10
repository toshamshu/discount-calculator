package com.example.discount.model;

import java.util.Date;

/**
 * Created by khaja on 9/8/2018.
 */
public class Customer {
    private long id;
    private String name;
    private CustomerType customerType;
    private Date createdDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", customerType=").append(customerType);
        sb.append(", createdDate=").append(createdDate);
        sb.append('}');
        return sb.toString();
    }
}

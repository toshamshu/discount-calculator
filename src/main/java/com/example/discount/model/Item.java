package com.example.discount.model;

/**
 * Created by khaja on 9/8/2018.
 */
public class Item {
    private long id;
    private String name;
    private double cost;
    private ItemType itemType;
    public Item(){}

    public Item(long id, String name, double cost, ItemType itemType) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.itemType = itemType;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public ItemType getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Item{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", cost=").append(cost);
        sb.append(", itemType=").append(itemType);
        sb.append('}');
        return sb.toString();
    }
}

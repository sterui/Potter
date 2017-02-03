package com.kata.potter;

/**
 * Created by sterui on 2/2/17.
 */
public class Books {

    private int id;
    private String name;
    private double price = 8.0;

    public Books(int _id, String _name) {
        this.id = _id;
        this.name = _name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

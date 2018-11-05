package com.epam.tasks.homework2.model;

import java.util.Objects;

public class Good {

    protected String name;
    protected int price;

    public Good(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return price == good.price &&
                Objects.equals(name, good.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}

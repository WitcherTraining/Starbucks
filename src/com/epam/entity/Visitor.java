package com.epam.entity;

import com.epam.impl.Coffee;

public class Visitor {
    private Coffee orderedCoffee;
    private int payedMoney;

    public int getPayedMoney() {
        return payedMoney;
    }

    public void setPayedMoney(int payMoney) {
        this.payedMoney = payMoney;
    }

    public Coffee getOrderedCoffee() {
        return orderedCoffee;
    }

    public void setOrderedCoffee(Coffee orderedCoffee) {
        this.orderedCoffee = orderedCoffee;
    }
}

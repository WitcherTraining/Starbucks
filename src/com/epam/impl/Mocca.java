package com.epam.impl;

public class Mocca implements Coffee {
    private final static String DRINK_LABEL = "МОККА ";
    private final static String DESCRIPTION = "- эспрессо, соус из темного шоколада, пропаренное молоко. " +
            "Сверху напиток украшается взбитыми сливками. Цена - ";
    private final static int PRICE = 1100;

    public String getDrinkLabel() {
        return DRINK_LABEL;
    }

    public String getDescription() {
        return DESCRIPTION;
    }

    public int getPrice() {
        return PRICE;
    }
}

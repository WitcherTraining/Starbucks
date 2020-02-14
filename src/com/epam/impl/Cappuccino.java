package com.epam.impl;

public class Cappuccino implements Coffee {
    private final static String DRINK_LABEL = "КАППУЧЧИНО ";
    private final static String DESCRIPTION = "- это классика в кофейном мире. Эспрессо, пропаренное " +
            "молоко, большое количество шелковистой воздушной молочной пены.  Цена - ";
    private final static int PRICE = 1200;

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

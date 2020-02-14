package com.epam.impl;

public class Latte implements Coffee {
    private final static String DRINK_LABEL = "ЛАТТЕ ";
    private final static String DESCRIPTION = "- нежное пропаренное молоко, богатый вкус эспрессо и тонкий слой " +
            "молочной пены, завершающий напиток. Цена - ";
    private final static int PRICE = 1300;

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

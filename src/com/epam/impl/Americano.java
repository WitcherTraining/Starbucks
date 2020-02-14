package com.epam.impl;

public class Americano implements Coffee {
    private final static String DRINK_LABEL = "АМЕРИКАНО ";
    private final static String DESCRIPTION = "- черный кофе на основе эспрессо с добавлением горячей воды. Цена - ";
    private final static int PRICE = 800;

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

package com.epam.impl;

public class Espresso implements Coffee {
    private final static String DRINK_LABEL = "ЭСПРЕССО ";
    private final static String DESCRIPTION = "с богатым насыщенным вкусом и карамельными сладкими нотками " +
            "– сердце всех фирменных напитков Старбакс на основе эспрессо. Цена - ";
    private final static int PRICE = 700;

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

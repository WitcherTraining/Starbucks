package com.epam.impl;

public class Macchiato implements Coffee {
    private final static String DRINK_LABEL = "МАКИАТО ";
    private final static String DESCRIPTION = "- фирменный напиток Старбакс. Пропаренное молоко в сочетании " +
            "с ванильным сиропом и насыщенным эспрессо. Цена - ";
    private final static int PRICE = 1500;

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

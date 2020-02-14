package com.epam.service;

import com.epam.impl.*;

public class CoffeeFactory implements Coffee {

    public Coffee createCoffee(CoffeeType type) {
        Coffee someCoffee = null;
        switch (type) {
            case ESPRESSO:
                someCoffee = new Espresso();
                break;
            case LATTE:
                someCoffee = new Latte();
                break;
            case MOCCA:
                someCoffee = new Mocca();
                break;
            case AMERICANO:
                someCoffee = new Americano();
                break;
            case MACCHIATO:
                someCoffee = new Macchiato();
                break;
            case CAPPUCCINO:
                someCoffee = new Cappuccino();
                break;
            default:
                throw new IllegalArgumentException("Такого кофе у нас нет, выберете из меню: ");
        }
        return someCoffee;
    }

    @Override
    public String getDrinkLabel() {
        return "coffeeFactory";
    }

    @Override
    public String getDescription() {
        return "coffeeFactory";
    }

    @Override
    public int getPrice() {
        return 0;
    }
}

package com.epam.service;

import com.epam.impl.*;

public class MenuService {
    private Americano americano = new Americano();
    private Cappuccino cappuccino = new Cappuccino();
    private Espresso espresso = new Espresso();
    private Latte latte = new Latte();
    private Mocca mocca = new Mocca();
    private Macchiato macchiato = new Macchiato();

    public void showMenu() {
        Coffee[] coffees = {espresso, cappuccino, macchiato, latte, americano, mocca};

        for (Coffee drinkType : coffees) {
            System.out.println(drinkType.getDrinkLabel() + drinkType.getDescription() + drinkType.getPrice() +
                    " тенге \n");
        }
        System.out.println("0 - Выйти из меню");
    }
}

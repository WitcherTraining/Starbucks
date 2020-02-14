package com.epam.entity;

import com.epam.service.MenuService;

public class Barista {

    private String[] fewGreetings = {"Тебе сегодня точно повезет!",
            "Будь собой и все получится!",
            "Кофе - напиток богов!",
            "Кофе пьется, мечты сбываются",
            "Да прибудет с тобой Сила!",
            "Держись... и хорошего настроения! :)",
            "Ты просто няша",
            "Ни дня без кофе!"};

    public String[] getFewGreetings() {
        return fewGreetings;
    }

    public void setFewGreetings(String[] fewGreetings) {
        this.fewGreetings = fewGreetings;
    }

    public void sayHello() {
        System.out.println("Привет, хотите посмотреть меню? У нас самый вкусный кофе, " +
                "Вам точно понравится! Вот полный список: \n");
        new MenuService().showMenu();
        System.out.println("Если какой-то вид кофе понравился в электронном меню, нажмите соответствующую " +
                "цифру и сразу после оплаты я приготовлю для Вас вкуснейший кофе");

    }

    public void writeSomeGreeting() {
        String[] sign = getFewGreetings();
        double rawRandom = Math.random() * sign.length;
        int randomSign = (int) rawRandom;
        System.out.print("*** На стаканчике написано: " + sign[randomSign] + " ***");
    }
}

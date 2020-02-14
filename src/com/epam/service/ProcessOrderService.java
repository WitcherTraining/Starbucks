package com.epam.service;


import com.epam.entity.Visitor;
import com.epam.impl.Coffee;

import java.io.IOException;

import static com.epam.StarbucksStarter.reader;


public class ProcessOrderService {

    private boolean checkOrder;
    private Visitor visitor = new Visitor();
    private CoffeeFactory coffeeFactory = new CoffeeFactory();

    public boolean isCheckOrder() {
        return checkOrder;
    }

    public void setCheckOrder(boolean checkOrder) {
        this.checkOrder = checkOrder;
    }

    public String doChoice() throws IOException {
        return reader.readLine();
    }

    public Coffee processChoice(String choice) throws IOException {
        choice = choice.toLowerCase();
        Coffee coffee = coffeeFactory.createCoffee(CoffeeType.ESPRESSO);
        setCheckOrder(true);

        switch (choice) {
            case "эспрессо":
                coffee = coffeeFactory.createCoffee(CoffeeType.ESPRESSO);
                break;
            case "каппуччино":
                coffee = coffeeFactory.createCoffee(CoffeeType.CAPPUCCINO);
                break;
            case "макиато":
                coffee = coffeeFactory.createCoffee(CoffeeType.MACCHIATO);
                break;
            case "латте":
                coffee = coffeeFactory.createCoffee(CoffeeType.LATTE);
                break;
            case "американо":
                coffee = coffeeFactory.createCoffee(CoffeeType.AMERICANO);
                break;
            case "мокка":
                coffee = coffeeFactory.createCoffee(CoffeeType.MOCCA);
                break;
            case "выход":
                System.out.println("Хорошего дня, приходите еще!");
                setCheckOrder(false);
                break;
            default:
                System.out.println("Такого вида кофе у нас нет, выберите вид кофейного напитка" +
                        " или нажмите 0 для выхода");
                doChoice();
        }

        return coffee;
    }

    public void askForPay(Coffee coffee) {
        System.out.println(coffee.getDrinkLabel() + " - отличный выбор, с Вас "
                + coffee.getPrice() + " тенге");
        visitor.setOrderedCoffee(coffee);
    }

    public void processOrder() throws IOException {
        System.out.println("Для оплаты введите необходимую сумму на терминале и нажмите Enter");
        int sum = 0;
        String anotherString = null;
        boolean isProceed = true;

        while (isProceed) {
            anotherString = reader.readLine();

            try {
                sum += Integer.parseInt(anotherString);
            } catch (NumberFormatException e) {
                System.out.println("Повторите ввод заново");
                processOrder();
            }

            visitor.setPayedMoney(sum);
            if (sum < 0) {
                System.out.println("Сумма не может быть отрицательной, повторите ввод");
                sum = 0;
            } else if (sum < visitor.getOrderedCoffee().getPrice()) {
                System.out.println("Чтобы полностью оплатить заказ, добавьте " +
                        (visitor.getOrderedCoffee().getPrice() - sum) + " тенге");
            } else if (sum > visitor.getOrderedCoffee().getPrice()) {
                System.out.println("Ваша сдача - " + (sum - visitor.getOrderedCoffee().getPrice()) +
                        " тенге, приятного дня!");
                isProceed = false;
            } else if (sum == visitor.getOrderedCoffee().getPrice()) {
                System.out.println("Вот ваш кофе, приятного дня!");
                isProceed = false;
            }
        }
    }
}

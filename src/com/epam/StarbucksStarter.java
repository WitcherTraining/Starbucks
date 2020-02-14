package com.epam;

import com.epam.entity.Barista;
import com.epam.impl.Coffee;
import com.epam.service.ProcessOrderService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarbucksStarter {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Barista antony = new Barista();
        ProcessOrderService service = new ProcessOrderService();

        antony.sayHello();
        String choosing = service.doChoice();
        Coffee coffee = service.processChoice(choosing);
        service.askForPay(coffee);
        service.processOrder();
        antony.writeSomeGreeting();

        reader.close();
    }
}

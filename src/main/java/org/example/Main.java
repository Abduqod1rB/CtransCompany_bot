package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyBot());
        System.out.println("Run...");

        /*Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter kg");
        int num1=scanner1.nextInt();


        System.out.println("Enter ob");
        int num2=scanner1.nextInt();

        double summa = num2*170;
        System.out.println("Umumiy harajat " +summa + "USD");*/


    }
}
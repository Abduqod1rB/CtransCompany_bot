package org.example;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(new MyBot());
        System.out.println("Run...");

        Costs.fill();
        System.out.println(Collections.singletonList(Costs.RailWaySmallAmount));
        System.out.println(Collections.singletonList(Costs.RailWayBigAmount));
        System.out.println(Collections.singletonList(Costs.CarSmallAmount));
        System.out.println(Collections.singletonList(Costs.CarBigAmount));


    }
}
package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/7/2024 *Time:11:38 AM
 */

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;



public class MyBot extends TelegramLongPollingBot {
    private final MyBotService myBotService = new MyBotService();
    private final MyBotServiceUz myBotServiceUz = new MyBotServiceUz();
    private final MyBotServiceRus myBotServiceRus = new MyBotServiceRus();
    private final MyBotServiceEng myBotServiceEng = new MyBotServiceEng();

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            Long chatId = update.getMessage().getChatId();
            String text = update.getMessage().getText();
            String userName =update.getMessage().getFrom().getFirstName();
            int id = DB.IdFinder(userName);

            if (text.equals("/start")) {
                if(id == -1){
                    DB.addUser(userName,"uz","start", "-1");
                    try {
                        execute(myBotService.languangeMenu(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }else {
                    String language = DB.users.get(id).getCurrentLanguage();
                    switch (language){
                        case "uz" -> {
                            try {
                                execute(myBotServiceUz.asosiyMenuUz(chatId));
                            } catch (TelegramApiException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        case "ru" -> {
                            try {
                                execute(myBotServiceRus.asosiyMenuRus(chatId));
                            } catch (TelegramApiException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        case "en" -> {
                            try {
                                execute(myBotServiceEng.asosiyMenuEng(chatId));
                            } catch (TelegramApiException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            switch (text) {
                case "Uzbek tili\uD83C\uDDFA\uD83C\uDDFF" -> {
                    try {
                        DB.users.get(id).setCurrentLanguage("uz");
                        execute(myBotServiceUz.kontaktYuborishUz(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "Русский язык\uD83C\uDDF7\uD83C\uDDFA" -> {
                    try {
                        DB.users.get(id).setCurrentLanguage("ru");
                        execute(myBotServiceRus.kontaktYuborishRus(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "English languange\uD83C\uDDFA\uD83C\uDDF8" -> {
                    try {
                        DB.users.get(id).setCurrentLanguage("en");
                        execute(myBotServiceEng.kontaktYuborishEng(chatId));
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            if(text.equals("\uD83D\uDCACIzoh qoldirish")){
                try {
                    execute(myBotServiceUz.izohQoldirishUz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                DB.users.get(id).setCurrentPosition("comment");
            }
            else if(text.equals("\uD83D\uDCACОставить комментарий")){
                try {
                    execute(myBotServiceRus.izohQoldirishRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
                 DB.users.get(id).setCurrentPosition("comment");
            }
            else if(text.equals("\uD83D\uDCACLeave a comment")){
                 try {
                     execute(myBotServiceEng.izohQoldirishEng(chatId));
                 } catch (TelegramApiException e) {
                     throw new RuntimeException(e);
                 }
                 DB.users.get(id).setCurrentPosition("comment");
            }
            else if(DB.users.get(id).getCurrentPosition().equals("comment")){
                switch (DB.users.get(id).getCurrentLanguage()){
                    case "uz" -> {
                        try {
                            execute(myBotServiceUz.izohQabulQilindiUz(chatId));
                            execute(myBotServiceUz.asosiyMenuUz(chatId));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "ru" -> {
                        try {
                            execute(myBotServiceRus.izohQabulQilindiRus(chatId));
                            execute(myBotServiceRus.asosiyMenuRus(chatId));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "en" -> {
                        try {
                            execute(myBotServiceEng.izohQabulQilindiEng(chatId));
                            execute(myBotServiceEng.asosiyMenuEng(chatId));
                        } catch (TelegramApiException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
                // get comment
                DB.users.get(id).setCurrentPosition("start");
            }

            if(text.equals("\uD83D\uDE9AXizmatlar")){
                try {
                    execute(myBotServiceUz.xizmatlar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83D\uDE9AУслуги")){
                try {
                    execute(myBotServiceRus.xizmatlarRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83D\uDE9AServices")){
                try {
                    execute(myBotServiceEng.servicesEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("✈️ Havo transporti")){
                try {
                    execute(myBotServiceUz.havotransporti(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("✈\uFE0F\uFE0FАвиаперевозки")){
                try {
                    execute(myBotServiceRus.havotransportiRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("✈\uFE0F Air transportation")){
                try {
                    execute(myBotServiceEng.havotransportiEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83D\uDE98 Avtomobil transporti")){
                try {
                    execute(myBotServiceUz.avtomobiltransporti(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83D\uDE98 Автоперевозки")){
                try {
                    execute(myBotServiceRus.avtomobiltransportiRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83D\uDE98 Auto transportation")){
                try {
                    execute(myBotServiceEng.autoTransportationEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83D\uDE88 Temir yo'l transporti")){
                try {
                    execute(myBotServiceUz.railwayTransportationUz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83D\uDE88 Железнодорожные перевозки")){
                try {
                    execute(myBotServiceRus.railwayTransportationRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83D\uDE88 Railway transportation")){
                try {
                    execute(myBotServiceEng.railwayTransportation(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Yivu va Guanchjou da ombor xizmatlari")){
                try {
                    execute(myBotServiceUz.werehouseUz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Складовые услуги в Иу и Гуанчжоу")){
                try {
                    execute(myBotServiceRus.werehouseRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Werehouse services in Yiwu and Gungzhou")){
                try {
                    execute(myBotServiceEng.werehouseEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Bojxona rasmiylashtiruvi xizmatlari")){
                try {
                    execute(myBotServiceUz.ccsUz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Услуги таможеннего оформления")){
                try {
                    execute(myBotServiceRus.ccsRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Customs Clearance services")){
                try {
                    execute(myBotServiceEng.ccsEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83D\uDE99Xitoydan mashinalar")){
                try {
                    execute(myBotServiceUz.xitoydanmashinalar(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83D\uDE99Авто из Китая")){
                try {
                    execute(myBotServiceRus.carsFromChinaRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83D\uDE99Cars from China")){
                try {
                    execute(myBotServiceEng.carsFromChinaEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Sedan")){
                try {
                    execute(myBotServiceUz.sedanUz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Krossover")){
                try {
                    execute(myBotServiceUz.crossoverUz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Xetchbek")){
                try {
                    execute(myBotServiceUz.xetchBackUz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Mikroavtobus")){
                try {
                    execute(myBotServiceUz.minivanUz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Седан")){
                try {
                    execute(myBotServiceRus.sedanRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Кросовер")){
                try {
                    execute(myBotServiceRus.crossoverRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Хетчбек")){
                try {
                    execute(myBotServiceRus.xetchBackRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Минивэн")){
                try {
                    execute(myBotServiceUz.minivanUz(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Sedan.")){
                try {
                    execute(myBotServiceEng.sedanEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Crossover")){
                try {
                    execute(myBotServiceEng.crossoverEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Hatchback")){
                try {
                    execute(myBotServiceEng.hatchBackEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Minivan")){
                try {
                    execute(myBotServiceEng.minivanEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BYD Seal")){
                try {
                    execute(myBotServiceUz.BYD_SEAL(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BYD Han")){
                try {
                    execute(myBotServiceUz.BYD_HAN(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Chevrolet Monza 1.5L Atmo")){
                try {
                    execute(myBotServiceUz.Chevrolet_Monza15(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Chevrolet Monza 1.3L Turbo")){
                try {
                    execute(myBotServiceUz.Chevrolet_Monza13(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Honda Crider 1.0L Turbo")){
                try {
                    execute(myBotServiceUz.Honda_Crider10_Turo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("LeapMotor C01")){
                try {
                    execute(myBotServiceUz.LeapMotor_C01(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("HiPhi Z")){
                try {
                    execute(myBotServiceUz.HiPhi_Z(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("IM Motors L7")){
                try {
                    execute(myBotServiceUz.IM_Motors_L7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Geometry G6")){
                try {
                    execute(myBotServiceUz.Geometry_G6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BMW i3 eDrive40")){
                try {
                    execute(myBotServiceUz.BMW_i3_eDrive40(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BMW i4 eDrive35")){
                try {
                    execute(myBotServiceUz.BMW_i4_eDrive35(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BMW i5 eDrive40")){
                try {
                    execute(myBotServiceUz.BMW_i5_eDrive40(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Neta S")){
                try {
                    execute(myBotServiceUz.Neta_S(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Neta Gt")){
                try {
                    execute(myBotServiceUz.Neta_Gt(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Zeeker 007")){
                try {
                    execute(myBotServiceUz.Zeekr_007(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BYD Seal")){
                try {
                    execute(myBotServiceRus.bydSealRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BYD Han")){
                try {
                    execute(myBotServiceRus.bydHanRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Chevrolet Monza 1.5L Atmo")){
                try {
                    execute(myBotServiceRus.chevroletMonzaAtmoRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Chevrolet Monza 1.3L Turbo")){
                try {
                    execute(myBotServiceRus.chevroletMonzaTurboRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Honda Crider 1.0L Turbo")){
                try {
                    execute(myBotServiceRus.HondaCriderTurboRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("LeapMotor C01")){
                try {
                    execute(myBotServiceRus.leapMotorC01Rus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("HiPhi Z")){
                try {
                    execute(myBotServiceRus.HiPhiZRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("IM Motors L7")){
                try {
                    execute(myBotServiceRus.imMotorsL7Rus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Geometry G6")){
                try {
                    execute(myBotServiceRus.geometryG6Rus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BMW i3 eDrive40")){
                try {
                    execute(myBotServiceRus.bmwi3eDrive40Rus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BMW i4 eDrive35")){
                try {
                    execute(myBotServiceRus.bmwi4eDrive35Rus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BMW i5 eDrive40")){
                try {
                    execute(myBotServiceRus.bmwi5eDrive40Rus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Neta S")){
                try {
                    execute(myBotServiceRus.netaSRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Neta Gt")){
                try {
                    execute(myBotServiceRus.netaGtRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Zeeker 007")){
                try {
                    execute(myBotServiceRus.zeeker007Rus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BYD Seal ")){
                try {
                    execute(myBotServiceEng.bydSeal(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("BYD Han ")){
                try {
                    execute(myBotServiceEng.bydHan(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("Chevrolet Monza 1.5L Atmo ")){
                try {
                    execute(myBotServiceEng.chevroletMonzaAtmo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Chevrolet Monza 1.3L Turbo ")){
                try {
                    execute(myBotServiceEng.chevroletMonzaTurbo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Honda Crider 1.0L Turbo ")){
                try {
                    execute(myBotServiceEng.HondaCriderTurbo(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("LeapMotor C01 ")){
                try {
                    execute(myBotServiceEng.leapMotorC01(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("HiPhi Z ")){
                try {
                    execute(myBotServiceEng.HiPhiZ(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("IM Motors L7 ")){
                try {
                    execute(myBotServiceEng.imMotorsL7(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Geometry G6 ")){
                try {
                    execute(myBotServiceEng.geometryG6(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("BMW i3 eDrive40 ")){
                try {
                    execute(myBotServiceEng.bmwi3eDrive40(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("BMW i4 eDrive35 ")){
                try {
                    execute(myBotServiceEng.bmwi4eDrive35(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("BMW i5 eDrive40 ")){
                try {
                    execute(myBotServiceEng.bmwi5eDrive40(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Neta S ")){
                try {
                    execute(myBotServiceEng.netaS(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Neta Gt ")){
                try {
                    execute(myBotServiceEng.netaGt(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if (text.equals("Zeeker 007 ")){
                try {
                    execute(myBotServiceEng.zeeker007(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }

            if(text.equals("\uD83E\uDDEEKalkulyator")){
                try {
                    execute(myBotServiceUz.kankulator(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83E\uDDEEКалькулятор")){
                try {
                    execute(myBotServiceRus.kanlkulyatorRus(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("\uD83E\uDDEECalculator")){
                try {
                    execute(myBotServiceEng.kanlkulyatorEng(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            else if(text.equals("✈️Havo transporti")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Yukning og'irligi (kg): ");
                DB.users.get(id).setCurrentPosition("kg");
                DB.users.get(id).setSendType("Air");
                try {
                    execute(sendMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(text.equals("✈️️Авиаперевозки")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Вес груза (кг): ");
                DB.users.get(id).setCurrentPosition("kg");
                DB.users.get(id).setSendType("Air");
                try {
                    execute(sendMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(text.equals("✈️Air transport")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Cargo weight (kg): ");
                DB.users.get(id).setCurrentPosition("kg");
                DB.users.get(id).setSendType("Air"); // type
                try {
                    execute(sendMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(text.equals("\uD83D\uDE88Temir yo'l transporti")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Yukning og'irligi (kg): ");
                DB.users.get(id).setCurrentPosition("kg");
                DB.users.get(id).setSendType("RailWay");
                try {
                    execute(sendMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(text.equals("\uD83D\uDE88Железнодорожные перевозки")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Вес груза (кг): ");
                DB.users.get(id).setCurrentPosition("kg");
                DB.users.get(id).setSendType("RailWay");
                try {
                    execute(sendMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(text.equals("\uD83D\uDE88Railway transport")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Cargo weight (kg): ");
                DB.users.get(id).setCurrentPosition("kg");
                DB.users.get(id).setSendType("RailWay"); // type
                try {
                    execute(sendMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(text.equals("\uD83D\uDE98Avtomobil transporti")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Yukning og'irligi (kg): ");
                DB.users.get(id).setCurrentPosition("kg");
                DB.users.get(id).setSendType("Car");
                try {
                    execute(sendMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(text.equals("\uD83D\uDE98Автоперевозки")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Вес груза (кг): ");
                DB.users.get(id).setCurrentPosition("kg");
                DB.users.get(id).setSendType("Car");
                try {
                    execute(sendMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(text.equals("\uD83D\uDE98Car transports")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                sendMessage.setText("Cargo weight (kg): ");
                DB.users.get(id).setCurrentPosition("kg");
                DB.users.get(id).setSendType("Car"); // type
                try {
                    execute(sendMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(DB.users.get(id).getCurrentPosition().equals("kg")){
                String currLan = DB.users.get(id).getCurrentLanguage();

                try{
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setChatId(chatId);
                    DB.users.get(id).setKg(Double.parseDouble(text));
                    DB.users.get(id).setCurrentPosition("volume");
                    switch (currLan){
                        case "uz" -> sendMessage.setText("Yuk hajmi (m3): ");
                        case "ru" -> sendMessage.setText("Вес груза (кг): ");
                        case "en" -> sendMessage.setText("Cargo weight (kg): ");
                    }
                    execute(sendMessage);
                }catch (Exception e){
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setChatId(chatId);
                    sendMessage.setText("Butun sonda kiriting");
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
            else if(DB.users.get(id).getCurrentPosition().equals("volume")){
                String currLan = DB.users.get(id).getCurrentLanguage();
                try {
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setChatId(chatId);
                    DB.users.get(id).setVolume(Double.parseDouble(text));
                    double volume = DB.users.get(id).getVolume(), kg = DB.users.get(id).getKg();
                    String sendType = DB.users.get(id).getSendType();
                    double price = 0;
                    switch (sendType){
                        case "Air" -> price = 0;
                        case "RailWay" -> price = Costs.priceRailWay(kg, volume);
                        case "Car" -> price = Costs.priceCar(kg, volume);
                    }
                    price = (double) Math.round(price * 100.0) / 100.0;
                    switch (currLan){
                        case "uz" ->{
                            sendMessage.setText("Narxi: " + price + "💲");
                            execute(sendMessage);
                            execute(myBotServiceUz.asosiyMenuUz(chatId));
                        }
                        case "ru" ->{
                            sendMessage.setText("Цена: " + price + "💲");
                            execute(sendMessage);
                            execute(myBotServiceRus.asosiyMenuRus(chatId));
                        }
                        case "en" ->{
                            sendMessage.setText("Price: " + price + "💲");
                            execute(sendMessage);
                            execute(myBotServiceEng.asosiyMenuEng(chatId));
                        }
                    }
                    DB.users.get(id).setCurrentPosition("start");


                }catch (Exception e){
                    SendMessage sendMessage = new SendMessage();
                    sendMessage.setChatId(chatId);
                    sendMessage.setText("Butun sonda kiriting");
                    try {
                        execute(sendMessage);
                    } catch (TelegramApiException ex) {
                        throw new RuntimeException(ex);
                    }
                }

            }


        }

        if (update.hasMessage() && update.getMessage().hasContact()) {
            SendMessage sendMessage = new SendMessage();
            Long chatId = update.getMessage().getChatId();
            sendMessage.setChatId(chatId);

            int id = DB.IdFinder(update.getMessage().getFrom().getFirstName());
            String phoneNumber = update.getMessage().getContact().getPhoneNumber();
            DB.users.get(id).setPhoneNumber(phoneNumber);

            String language = DB.users.get(id).getCurrentLanguage();
            switch (language){
                case "uz" -> {
                    try {
                        execute(myBotServiceUz.asosiyMenuUz(chatId));
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "ru" -> {
                    try {
                        execute(myBotServiceRus.asosiyMenuRus(chatId));
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
                case "en" -> {
                    try {
                        execute(myBotServiceEng.asosiyMenuEng(chatId));
                        execute(sendMessage);
                    } catch (TelegramApiException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "CtransCompany_bot";
    }

    @Override
    public String getBotToken() {
        return "6750077771:AAHZhiNfwfEvM95P1LHl2HRPl9aDRaPgWTA";
    }
}


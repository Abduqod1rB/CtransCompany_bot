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
                System.out.println(text);
                DB.users.get(id).setCurrentPosition("start");
            }

            if(text.equals("\uD83E\uDDEEKalkulyator")){
                try {
                    execute(myBotServiceUz.kankulator(chatId));
                } catch (TelegramApiException e) {
                    throw new RuntimeException(e);
                }
            }
            if(text.equals("✈\uFE0FHavo transporti")){
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
            else if(DB.users.get(id).getCurrentPosition().equals("kg")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                try {
                    DB.users.get(id).setKg(Double.parseDouble(text));
                    sendMessage.setText("Yuk hajmi (m3): ");
                    DB.users.get(id).setCurrentPosition("volume");
                }catch (Exception e){
                    sendMessage.setText("Butun sonda kiriting");
                }
                try {
                    execute(sendMessage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            else if(DB.users.get(id).getCurrentPosition().equals("volume")){
                SendMessage sendMessage = new SendMessage();
                sendMessage.setChatId(chatId);
                try {
                    DB.users.get(id).setVolume(Double.parseDouble(text));
                    double volume = DB.users.get(id).getVolume(), kg = DB.users.get(id).getKg();
                    switch (DB.users.get(id).getSendType()){
                        case "Air" -> {
                             //sendMessage.setText(String.valueOf()));
                        }
                    }
                    DB.users.get(id).setCurrentPosition("start");

                }catch (Exception e){
                    sendMessage.setText("Butun sonda kiriting");
                }
                try {
                    execute(sendMessage);
                } catch (Exception e) {
                    e.printStackTrace();
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


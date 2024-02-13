package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/9/2024 *Time:9:24 AM
 */

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotServiceUz {
    public SendMessage asosiyMenuUz(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Asosiy Menu");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDE9AXizmatlar");
        row.add(button);
        rowList.add(row);
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDE99Xitoydan mashinalar");
        row1.add(button1);
        rowList.add(row1);
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("⏰Yetkazib berish muddati");
        row2.add(button2);
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("☎\uFE0FBiz bilan bog'lanish");
        row2.add(button3);
        rowList.add(row2);
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83C\uDFDBValyuta kursi");
        row3.add(button4);
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83E\uDDEEKalkulyator");
        row3.add(button5);
        rowList.add(row3);
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("ℹ\uFE0FBiz haqimizda");
        row4.add(button6);
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDCACIzoh qoldirish");
        row4.add(button7);
        rowList.add(row4);
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⚙\uFE0FSozlamalar");
        row5.add(button8);
        rowList.add(row5);
        reply.setKeyboard(rowList);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage kontaktYuborishUz(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCDE Ro'yxatdan o'tish uchun telefon raqamingizni kiriting. \n" +
                " \n" +
                " Raqamni +998********* shaklida yuboring.");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();

        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setRequestContact(true);
        button1.setText("☎\uFE0F Telefon raqamni yuborish");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage izohQoldirishUz(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Izoh qoldiring. Sizning fikringiz biz uchun muhim");
        sendMessage.setChatId(chatId);
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅\uFE0FOrqaga");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage izohQabulQilindiUz(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅Izohingiz qabul qilindi");
        return sendMessage;
    }
    public SendMessage kankulator(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("O'zingizga kerakli transportni tanglang");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("✈\uFE0FHavo transporti");
        row.add(button);
        rows.add(row);
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDE88Temir yo'l transporti");
        row.add(button1);
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDE98Avtomobil transporti");
        row1.add(button2);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage xizmatlar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        //1.Sedan,2.Krossover,3.Xetchbek,4.Mikroavtobus
        button1.setText("✈️Havo transporti");button2.setText("\uD83D\uDE98Avtomobil transporti");
        button3.setText("\uD83D\uDE88Temir yo'l transporti");

        row1.add(button1);row1.add(button2);row1.add(button3);

        rowList.add(row1);
        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage xitoydanmashinalar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        //1.Sedan,2.Krossover,3.Xetchbek,4.Mikroavtobus
        button1.setText("Sedan");button2.setText("Krossover");
        button3.setText("Xetchbek");button4.setText("Mikroavtobus");

        row1.add(button1);row1.add(button2);
        row2.add(button3);row2.add(button4);

        rowList.add(row1);rowList.add(row2);
        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }


}

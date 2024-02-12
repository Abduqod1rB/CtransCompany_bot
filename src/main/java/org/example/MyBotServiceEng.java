package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/9/2024 *Time:9:25 AM
 */

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MyBotServiceEng {
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
    public SendMessage kontaktYuborishEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCDE Enter your phone number to register. \n" +
                " \n" +
                " Send the number as +1***********.");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();

        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setRequestContact(true);
        button1.setText("☎\uFE0F Send phone number");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    public SendMessage izohQoldirishEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Leave a comment. Your opinion is important to us");
        sendMessage.setChatId(chatId);
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅\uFE0F Back");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage izohQabulQilindiEng(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅Your comment has been accepted");
        return sendMessage;
    }

    public SendMessage placeAnorderMenu(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardRow row1 = new KeyboardRow();
        List<KeyboardRow> rows = new ArrayList<>();

        button1.setText("\uD83D\uDE98Cars from China");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
}

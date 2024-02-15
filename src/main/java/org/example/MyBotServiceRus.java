package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MyBotServiceRus {
    public SendMessage asosiyMenuRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Main menu");
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        KeyboardButton button6 = new KeyboardButton();
        KeyboardButton button7 = new KeyboardButton();
        KeyboardButton button8 = new KeyboardButton();
        button.setText("\uD83D\uDE9AServices");
        button1.setText("\uD83D\uDE99Cars from China");
        button2.setText("⏰Delivery time");
        button3.setText("☎️\uFE0Fcontact us");
        button4.setText("\uD83C\uDFDBCurrency rates");
        button5.setText("\uD83E\uDDEECalculator");
        button6.setText("ℹ️\uFE0Fabout Us");
        button7.setText("\uD83D\uDCACLeave a comment");
        button8.setText("⚙️\uFE0FSettings");
        row.add(button);
        row1.add(button1);
        row2.add(button2);
        row2.add(button3);
        row3.add(button4);
        row3.add(button5);
        row4.add(button6);
        row4.add(button7);
        row5.add(button8);
        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        replyKeyboardMarkUp.setKeyboard(rowList);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);
        return sendMessage;
    }

    public SendMessage kontaktYuborishRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCDE Enter your phone number to register. \n" +
                " \n" +
                " Send the number as +998***********.");
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setRequestContact(true);
        button1.setText("☎️\uFE0FSend phone number");
        row1.add(button1);
        rows.add(row1);

        replyKeyboardMarkUp.setKeyboard(rows);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);

        return sendMessage;
    }

    public SendMessage izohQoldirishRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Leave a comment. Your opinion is important to us");
        sendMessage.setChatId(chatId);
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️\uFE0FBack");
        row1.add(button1);
        rows.add(row1);

        replyKeyboardMarkUp.setKeyboard(rows);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);

        return sendMessage;
    }

    public SendMessage izohQabulQilindiRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅Your comment has been accepted");
        return sendMessage;
    }


    public SendPhoto aboutUsRus(Long chatId) {

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("D:\\My_Telegram_bots\\CTRANS_bot\\image\\aboutUs.png")));
        sendPhoto.setCaption("О НАС\n" +
                    "<b>Опыт работы в сфере</b>\n" +
                "<b>логистических услуг по</b>\n" +
                "<b>всему миру.<b>\n" +
                " \n" +
                "Мы гордимся тем, что предоставляем лучшие\n" +
                "предложения по доставке и транспортировке по всему миру.\n" +
                " \n" +
                "✅100 % Компенсации ✅Поддержка 24/7\n" +
                "✅Опытная команда  ✅Страхование грузов\n" +
                "✅Поддержка 24/7      ✅Безопасный склад");

        return sendPhoto;
    }

    public SendMessage minivanRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
            sendMessage.setText("Выберите тип минивэна");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();

        button.setText("Denza D9");
        button1.setText("Zeeker 009");

        row.add(button);
        row.add(button1);

        rowList.add(row);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage hatchBackRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип хэтчбека");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();

        button.setText("Neta S");
        button1.setText("Neta Gt");
        button2.setText("Zeeker 007");

        row.add(button);
        row.add(button1);
        row1.add(button2);

        rowList.add(row);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage sedanRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип седана");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardRow row6 = new KeyboardRow();
        KeyboardRow row7 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        KeyboardButton button6 = new KeyboardButton();
        KeyboardButton button7 = new KeyboardButton();
        KeyboardButton button8 = new KeyboardButton();
        KeyboardButton button9 = new KeyboardButton();
        KeyboardButton button10 = new KeyboardButton();
        KeyboardButton button11 = new KeyboardButton();
        KeyboardButton button12 = new KeyboardButton();
        KeyboardButton button13 = new KeyboardButton();
        KeyboardButton button14 = new KeyboardButton();

        button.setText("BYD Seal");
        button1.setText("BYD Han");
        button2.setText("Chevrolet Monza 1.5L Atmo");
        button3.setText("Chevrolet Monza 1.3L Turbo");
        button4.setText("Honda Crider 1.0L Turbo");
        button5.setText("LeapMotor C01");
        button6.setText("HiPhi Z");
        button7.setText("IM Motors L7");
        button8.setText("Geometry G6");
        button9.setText("BMW i3 eDrive40");
        button10.setText("BMW i4 eDrive35");
        button11.setText("BMW i5 eDrive40");
        button12.setText("Neta S");
        button13.setText("Neta Gt");
        button14.setText("Zeeker 007");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        row2.add(button4);
        row2.add(button5);
        row3.add(button6);
        row3.add(button7);
        row4.add(button8);
        row4.add(button9);
        row5.add(button10);
        row5.add(button11);
        row6.add(button12);
        row6.add(button13);
        row7.add(button14);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage crossoverRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип кроссовера");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardRow row6 = new KeyboardRow();
        KeyboardRow row7 = new KeyboardRow();
        KeyboardRow row8 = new KeyboardRow();
        KeyboardRow row9 = new KeyboardRow();
        KeyboardRow row10 = new KeyboardRow();
        KeyboardRow row11 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        KeyboardButton button6 = new KeyboardButton();
        KeyboardButton button7 = new KeyboardButton();
        KeyboardButton button8 = new KeyboardButton();
        KeyboardButton button9 = new KeyboardButton();
        KeyboardButton button10 = new KeyboardButton();
        KeyboardButton button11 = new KeyboardButton();
        KeyboardButton button12 = new KeyboardButton();
        KeyboardButton button13 = new KeyboardButton();
        KeyboardButton button14 = new KeyboardButton();
        KeyboardButton button15 = new KeyboardButton();
        KeyboardButton button16 = new KeyboardButton();
        KeyboardButton button17 = new KeyboardButton();
        KeyboardButton button18 = new KeyboardButton();
        KeyboardButton button19 = new KeyboardButton();
        KeyboardButton button20 = new KeyboardButton();
        KeyboardButton button21 = new KeyboardButton();
        KeyboardButton button22 = new KeyboardButton();

        button.setText("BYD Song Plus Champion Edition");
        button1.setText("BYD Tang EV");
        button2.setText("BYD Yuan Plus EV");
        button3.setText("Zeeker 001");
        button4.setText("Zeeker X");
        button5.setText("LeapMotor C11");
        button6.setText("Geely Geometry E");
        button7.setText("Denza N7");
        button8.setText("HiPhi Y");
        button9.setText("NIO ES8");
        button10.setText("NIO EC7");
        button11.setText("LI Auto L7");
        button12.setText("LI Auto L9");
        button13.setText("IM Motors LS7");
        button14.setText("Geometry M6");
        button15.setText("LI Auto L8");
        button16.setText("Avatr 11");
        button17.setText("HiPhi X");
        button18.setText("LI Auto One");
        button19.setText("Lynk&Co 09EM-P");
        button20.setText("Chevrolet Seeker");
        button21.setText("BYD Song L");
        button22.setText("BYD Yangwang U8");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        row2.add(button4);
        row2.add(button5);
        row3.add(button6);
        row3.add(button7);
        row4.add(button8);
        row4.add(button9);
        row5.add(button10);
        row5.add(button11);
        row6.add(button12);
        row6.add(button13);
        row7.add(button14);
        row7.add(button15);
        row8.add(button16);
        row8.add(button17);
        row9.add(button18);
        row9.add(button19);
        row10.add(button20);
        row10.add(button21);
        row11.add(button22);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);
        rowList.add(row8);
        rowList.add(row9);
        rowList.add(row10);
        rowList.add(row11);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage servicesRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип услуги");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        button.setText("Авиаперевозки");
        button1.setText("Автоперевозки");
        button2.setText("Железнодорожные перевозки");
        button3.setText("Складовые услуги в Иу и Гуанчжоу");
        button4.setText("Услуги таможеннего оформления");
        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        row2.add(button4);
        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage carsFromChinaRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите свой тип автомобиля");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        button.setText("Седан");
        button1.setText("Кросовер");
        button2.setText("Хетчбек");
        button3.setText("Минивэн");
        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        rowList.add(row);
        rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }



    public SendMessage kanlkulyatorRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите транспорт, который вам нужен");
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        button.setText("✈️\uFE0FАвиаперевозки");
        button1.setText("\uD83D\uDE88Железнодорожные перевозки");
        button2.setText("\uD83D\uDE98Автоперевозки");
        row.add(button);
        row.add(button1);
        row1.add(button2);
        rows.add(row);
        rows.add(row1);
        replyKeyboardMarkUp.setKeyboard(rows);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);
        return sendMessage;
    }
}

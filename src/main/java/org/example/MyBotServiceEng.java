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

public class MyBotServiceEng {
    public SendMessage asosiyMenuEng(Long chatId) {
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

    public SendMessage kontaktYuborishEng(Long chatId) {
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

    public SendMessage izohQoldirishEng(Long chatId) {
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

    public SendMessage izohQabulQilindiEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅Your comment has been accepted");
        return sendMessage;
    }


    public SendPhoto aboutUsEng(Long chatId) {

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("D:\\My_Telegram_bots\\CTRANS_bot\\image\\aboutUs.png")));
        sendPhoto.setCaption("ABOUT US\n" +
                "<b>Experience in the field of</b>\n" +
                "<b>logistics services around the</b>\n" +
                "<b>world.<b>\n" +
                " \n" +
                "We pride ourselves on providing the best shipping and\n" +
                "transportation deals around the world.\n" +
                " \n" +
                "✅100% Compensation ✅Online tracking\n" +
                "✅Experienced Team  ✅Cargo insurance\n" +
                "✅Support 24/7      ✅Safe warehouse");

        return sendPhoto;
    }

    public SendMessage minivanEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("select the minivan type");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();

        button.setText("Denza D9");
        button1.setText("Zeeker 009");
        button2.setText("⬅️ Back");

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

    public SendMessage hatchBackEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("select the hatchback type");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button.setText("Neta S");
        button1.setText("Neta Gt");
        button2.setText("Zeeker 007");
        button3.setText("⬅️ Back");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row2.add(button3);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage sedanEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("select the sedan type");

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
        button15.setText("⬅️ Back");

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
        row8.add(button15);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);
        rowList.add(row4);
        rowList.add(row5);
        rowList.add(row6);
        rowList.add(row7);
        rowList.add(row8);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage crossoverEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("select the crossover type");

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
        KeyboardRow row12 = new KeyboardRow();

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
        KeyboardButton button23 = new KeyboardButton();

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
        button23.setText("⬅️ Back");

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
        row12.add(button23);

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
        rowList.add(row12);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage servicesEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Select the type of service.");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();

        button.setText("Air transportation");
        button1.setText("Auto transportation");
        button2.setText("Railway transportation");
        button3.setText("Werehouse services in Yiwu and Gungzhou");
        button4.setText("Customs Clearance services");
        button5.setText("⬅️ Back");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        row2.add(button4);
        row3.add(button5);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }

    public SendMessage carsFromChinaEng(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("choose your type car");

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

        button.setText("Sedan");
        button1.setText("Crossover");
        button2.setText("Hatchback");
        button3.setText("Minivan");
        button4.setText("⬅️ Back");

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



    public SendMessage kanlkulyatorEng(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Choose the transport you need");
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        button.setText("✈️\uFE0FAir transport");
        button1.setText("\uD83D\uDE88Railway transport");
        button2.setText("\uD83D\uDE98Car transports");
        button3.setText("⬅️ Back");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row2.add(button3);

        rows.add(row);
        rows.add(row1);
        rows.add(row2);

        replyKeyboardMarkUp.setKeyboard(rows);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);
        return sendMessage;
    }

    public SendMessage settingsEng(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("⚙️Settings");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();

        button.setText("\uD83C\uDDFA\uD83C\uDDF8Change language");
        button1.setText("☎️change phone number");
        button2.setText("⬅️ Back");
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
}

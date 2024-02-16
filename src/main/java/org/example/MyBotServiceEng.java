package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMediaGroup;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.media.InputMediaPhoto;
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



    public SendMessage kanlkulyator(Long chatId) {
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

    public SendMessage settingsEng (Long chatId){

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

    public SendPhoto bydSeal(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/GbnFoweKIIJ8SGRcR3X1qaBAmgizk9E8798rn536.webp"));
        sendPhoto.setCaption("""
                BYD Seal
                
                ✅Battery capacity, kW: 82,5       
                ✅Acceleration 0-100 km, sec: 3,8  
                ✅Power, kW/hp: 390/530            
                ✅Drive unit: Full                 
                ✅Range (NEDC), km: 650
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 180
                ✅Charging speed (slow / fast), hour: 11,8/0,5
                
                The BYD Seal is a compact electric executive sedan produced by BYD Auto. BYD Seal is built on e-Platform 3.0, BYD's new 800-volt automotive platform.
                """);

        return sendPhoto;
    }

    public SendPhoto bydHan(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/G5LEALmmX7YN3h2S0ejHxggKreWq0hgj0rkNV3zI.webp"));
        sendPhoto.setCaption("""
                BYD Han
                
                ✅Battery capacity, kW: 85,4    
                ✅Acceleration 0-100 km, sec: 3,9
                ✅Power, kW/hp: 380/517         
                ✅Drive unit: Full                 
                ✅Range (NEDC), km: 610
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 185
                ✅Charging speed (slow / fast), hour: 12,2/0,5
                
                BYD Han can boast a beautiful, stylish, distinctive and presentable look - a predatory front with narrow headlights and relief bumper, solid silhouette with a long hood, expressive sides and a small "tail" of the trunk, graceful stern with stylish lights.
                """);

        return sendPhoto;
    }

    public SendPhoto chevroletMonzaAtmo(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/7XZX6Aa66UBk54V6XkdOikpRj7MaSpDsfdPEecaw.webp"));
        sendPhoto.setCaption("""
                Chevrolet Monza 1.5L Atmo
                
                ✅Engine: 1.5 L (113 hp)    
                ✅Transmission: 6-AT (Robot)
                ✅Acceleration (0-100 km/h): 12.9 s         
                ✅Fuel type: Petrol                 
                ✅Drive unit: Full
                ✅Number of seats: 5
               
                Chevrolet Monza sedan, new model 2023, front wheel drive. Gasoline engine - 1.5 liters, 113 horsepower, 6-speed automatic transmission.                
                """);

        return sendPhoto;
    }

    public SendPhoto chevroletMonzaTurbo(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/b3iKeMlJtqB2tNlBX4F9UYXbWLtrXRqJiD9ht8Sm.webp"));
        sendPhoto.setCaption("""
                Chevrolet Monza 1.3L Turbo
                
                ✅Engine: 1.3L Tubro (163 hp)    
                ✅Transmission: 6-AT (Robot)
                ✅Acceleration (0-100 km/h): 9.2 s         
                ✅Fuel type: Petrol                 
                ✅Drive unit: Full
                ✅Drive unit: Full
               
                Chevrolet Monza sedan, new model 2023, front wheel drive. Gasoline engine - 1.3 liters (Turbo), 163 horsepower, 6-speed automatic transmission.            
                """);

        return sendPhoto;
    }

    public SendPhoto HondaCriderTurbo(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/WWWDezhpGgYHzzR9VApgwmj9eeNyNtW7OAlYygCk.webp"));
        sendPhoto.setCaption("""
                Honda Crider 1.0L Turbo
                
                ✅Engine capacity: 1.0 L Turbo   
                ✅Engine's type: Petrol
                ✅Consumption: 5.0 L     
                ✅Power: 122 HP                 
                ✅Acceleration to 100: 10.7 s
               
                Honda Crider is a C-class sedan, front-wheel drive. Petrol engines with a capacity of 122 horsepower.
                """);

        return sendPhoto;
    }

    public SendPhoto leapMotorC01(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/gAvBM75WivxQrmjUD4oBWpXvhS0MjkTfLEvz2v5d.webp"));
        sendPhoto.setCaption("""
                LeapMotor C01
                
                ✅Battery capacity, kW: 90   
                ✅Acceleration 0-100 km, sec: 3,6
                ✅Power, kW/hp: 400/544     
                ✅Drive unit: Full                 
                ✅Range (NEDC), km: 630
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 180
               
                Leapmotor C01 Advance in its life is an electric car with Deluxe technology where there is an integration of innovative technologies for a soft and elegant appearance. Focus on high quality and satisfaction of various needs.
                """);

        return sendPhoto;
    }

    public SendPhoto HiPhiZ(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/TmaFh6qeILQV09RdIovwNghxCrx9BASiaMFvgdO9.webp"));
        sendPhoto.setCaption("""
                HiPhi Z
                
                ✅Battery capacity, kW: 120
                ✅Acceleration 0-100 km, sec: 3,8
                ✅Power, kW/hp: 494/672
                ✅Drive unit: Full
                ✅Power reserve (NEDC), km: 705
                ✅Number of seats: 4
                ✅Maximum speed, km/h: 200
                ✅Charging speed (slow / fast), hour: 12,4/0,92               
                
                Welcome to the future of the automotive industry! Introducing the HiPhi Z, the epitome of cutting-edge technology and incomparable style that redefines the modern automotive dream. Combining elegance and innovation, HiPhi Z embodies a sophisticated design that is truly admirable at first sight. Harmoniously combining sleek, sleek lines with eye-catching details, this car is designed to grab attention on the road and remain the epitome of modern car design for years to come.
                """);

        return sendPhoto;
    }

    public SendPhoto imMotorsL7(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/n7IgJoqfWsM0w5ljA24sr0wBGUq7lrUp3g9bb5wi.webp"));
        sendPhoto.setCaption("""
                IM Motors L7
                
                ✅Battery capacity, kW: 90
                ✅Acceleration 0-100 km, sec: 3,7
                ✅Power: 445kW / 605Nm
                ✅Drive unit: Full
                ✅Power reserve, km: 615
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 200             

                Zhiji Auto is a brand jointly created by SAIC Group, Zhangjiang Hi-Tech and Alibaba Group. His Zhiji L7 is an all-electric executive sedan, size 3,100mm wheelbase and dual-engine system, 0-100km/h in just 3.9 seconds. The Zhiji L7 electric car has a length, width and height of 5098/1960/1485 mm and a wheelbase of 3100 mm. Drag coefficient 0.21.
                """);

        return sendPhoto;
    }

    public SendPhoto geometryG6(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/Zl6MhKhdsf1r5CfqLELkB4DnHjaliEh4XoTU6I56.webp"));
        sendPhoto.setCaption("""
                Geometry G6
                
                ✅Battery capacity, kW: 70
                ✅Acceleration 0-100 km, sec: 6,9
                ✅Power: 150kW / 204Nm
                ✅Drive unit: Front
                ✅Power reserve, km: 580
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 150

                The front of the car received a closed grille, and a glowing Geely Logo was installed under the hood. The main optics of the model has a sharp shape. Also of note is the use of hidden door handles and five-spoke rims. The G6 headlight group is irregularly shaped and connected by a black decorative stripe, forming a penetrating design.
                """);

        return sendPhoto;
    }

    public SendPhoto bmwi3eDrive40(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/eQXmyVoEXPqMbHTXPKK2SrtMvKeFYs9BkaYGTs70.webp"));
        sendPhoto.setCaption("""
                BMW i3 eDrive40
                
                ✅Battery capacity, kW: 78,92
                ✅Acceleration 0-100 km, sec: 5,6
                ✅Power, kW/hp: 250/340
                ✅Drive unit: rear
                ✅Power reserve (NEDC), km: 592
                ✅Number of seats: 5
                ✅Maximum speed, km/h: 180
                ✅Charging speed (slow / fast), hour: 7,5/0,68
                
                The BMW i3 represents an uncompromising and attractive solution for the personal mobility requirements of the present and future in urban areas. The world's first premium car specifically designed to run entirely on electric power - and therefore emission-free.
                """);

        return sendPhoto;
    }
}

package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/9/2024 *Time:9:24 AM
 */

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.io.File;
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
        button3.setText("☎️Biz bilan bog'lanish");
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
        button6.setText("ℹ️Biz haqimizda");
        row4.add(button6);
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDCACIzoh qoldirish");
        row4.add(button7);
        rowList.add(row4);
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⚙️Sozlamalar");
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
        button1.setText("☎️ Telefon raqamni yuborish");
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
        button1.setText("⬅️Orqaga");
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
        button.setText("✈️Havo transporti");

        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDE88Temir yo'l transporti");

        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDE98Avtomobil transporti");

        KeyboardButton button3 = new KeyboardButton();
        button3.setText("⬅️Orqaga");

        row.add(button);row.add(button1);
        row1.add(button2);row1.add(button3);

        rows.add(row);rows.add(row1);

        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage xizmatlar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        KeyboardButton button6 = new KeyboardButton();
        button1.setText("✈️Havo transporti");button2.setText("\uD83D\uDE98Avtomobil transporti");
        button3.setText("\uD83D\uDE88Temir yo'l transporti");button4.setText("Yivu va Guanchjou da ombor xizmatlari");
        button5.setText("Bojxona rasmiylashtiruvi xizmatlari");button6.setText("⬅️Orqaga");
        row.add(button1);row.add(button2);row.add(button3);
        row1.add(button4);row1.add(button5);row1.add(button6);
        rowList.add(row);rowList.add(row1);
        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendPhoto havotransporti(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTQadhwXWWBK6q3N87eDm4XylkA9kFEroW9Aw&usqp=CAU"));
        sendPhoto.setCaption("CTRANS katta o'lchamlari va og'irligi bo'lgan keng turdagi tovarlarni havo orqali tashishni taklif qiladi. Xitoy-O'zbekiston bilan havo transporti ko'pchilik o'zbekistonliklarning tanlovidir. Biz sizga eng qisqa vaqt ichida tez, xavfsiz va sifatli tashishni kafolatlaymiz.\n" +
                "\n" +
                "CTRANS xodimlari har bir mahsulotga ehtiyotkorlik bilan munosabatda bo'lishadi va tashishni nazorat qilishadi. Biz bilan mahsulotlaringiz xavfsiz va sog'lom yetib kelishiga amin bo'lishingiz mumkin.");
        return sendPhoto;
    }
    public SendPhoto avtomobiltransporti(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTQadhwXWWBK6q3N87eDm4XylkA9kFEroW9Aw&usqp=CAU"));
        sendPhoto.setCaption("Avtomobil transportida yuk tashish transport xizmatlari bozorining eng muhim tarkibiy qismi bo'lib, aynan shu yo'nalish yuklarni jo'natuvchidan oluvchiga tashish sohasida yetakchi hisoblanadi.\n" +
                "\n" +
                "Boshqa transport turlari bilan taqqoslaganda, bugungi kunda avtotransport jiddiy ustuvor yo'nalish bo'lib qolmoqda. Avtotransport yuklarining afzalliklari orasida:\n" +
                "\n" +
                "manevr qobiliyati;\n" +
                "logistika kompaniyasi uchun eng foydali marshrutlarni amalga oshirish uchun keng imkoniyatlar;\n" +
                "yetkazib berish tezligi;\n" +
                "tashiladigan tovarlarning keng assortimenti;\n" +
                "bir nechta kompaniyalarning posilkalarini birlashtirgan holda, guruhli yo'l yuklarini shakllantirish;\n" +
                "yukning og'irligi, formati va o'lchamlari, yonuvchan tovarlar va tez buziladigan mahsulotlarning mavjudligi kabi omillarni hisobga olgan holda transport vositalarining katta tanlovi;");
        return sendPhoto;
    }

    public SendMessage xitoydanmashinalar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        button1.setText("Sedan");button2.setText("Krossover");
        button3.setText("Xetchbek");button4.setText("Mikroavtobus");
        button5.setText("⬅️Orqaga");

        row1.add(button1);row1.add(button2);
        row2.add(button3);row2.add(button4);
        row3.add(button5);

        rowList.add(row1);rowList.add(row2);rowList.add(row3);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }
    public SendMessage sozlamalar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();

        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button1.setText("Tilni almashtirish");button2.setText("☎️Telefon raqamini alashtirish");
        button3.setText("⬅️Orqaga");

        row1.add(button1);row1.add(button2);
        row2.add(button3);

        rowList.add(row1);rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        return sendMessage;
    }

    public SendMessage sedanUz(Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Sedanni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardRow row6 = new KeyboardRow();
        KeyboardRow row7 = new KeyboardRow();
        KeyboardRow row8 = new KeyboardRow();

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

        button1.setText("BYD Seal");
        button2.setText("BYD Han");
        button3.setText("Chevrolet Monza 1.5L Atmo");
        button4.setText("Chevrolet Monza 1.3L Turbo");
        button5.setText("Honda Crider 1.0L Turbo");
        button6.setText("LeapMotor C01");
        button7.setText("HiPhi Z");
        button8.setText("IM Motors L7");
        button9.setText("Geometry G6");
        button10.setText("BMW i3 eDrive40");
        button11.setText("BMW i4 eDrive35");
        button12.setText("BMW i5 eDrive40");
        button13.setText("Neta S");
        button14.setText("Neta Gt");
        button15.setText("Zeeker 007");
        button16.setText("⬅️Orqaga");

        row1.add(button1);row1.add(button2);
        row2.add(button3);row2.add(button4);
        row3.add(button5);row3.add(button6);
        row4.add(button7);row4.add(button8);
        row5.add(button9);row5.add(button10);
        row6.add(button11);row6.add(button12);
        row7.add(button13);row7.add(button14);
        row8.add(button15);row8.add(button16);

        rowList.add(row1);rowList.add(row2);rowList.add(row3);rowList.add(row4);
        rowList.add(row5);rowList.add(row6);rowList.add(row7);rowList.add(row8);

        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setKeyboard(rowList);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage crossoverUz(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Krossoverni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

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
        KeyboardButton button24 = new KeyboardButton();

        button1.setText("BYD Song Plus Champion Edition");
        button2.setText("BYD Tang EV");
        button3.setText("BYD Yuan Plus EV");
        button4.setText("Zeeker 001");
        button5.setText("Zeeker X");
        button6.setText("LeapMotor C11");
        button7.setText("Geely Geometry E");
        button8.setText("Denza N7");
        button9.setText("HiPhi Y");
        button10.setText("NIO ES8");
        button11.setText("NIO EC7");
        button12.setText("LI Auto L7");
        button13.setText("LI Auto L9");
        button14.setText("IM Motors LS7");
        button15.setText("Geometry M6");
        button16.setText("LI Auto L8");
        button17.setText("Avatr 11");
        button18.setText("HiPhi X");
        button19.setText("LI Auto One");
        button20.setText("Lynk&Co 09EM-P");
        button21.setText("Chevrolet Seeker");
        button22.setText("BYD Song L");
        button23.setText("BYD Yangwang U8");
        button24.setText("⬅️Orqaga");

        row1.add(button1);row1.add(button2);
        row2.add(button3);row2.add(button4);
        row3.add(button5);row3.add(button6);
        row4.add(button7);row4.add(button8);
        row5.add(button9);row5.add(button10);
        row6.add(button11);row6.add(button12);
        row7.add(button13);row7.add(button14);
        row8.add(button15);row8.add(button16);
        row9.add(button17);row9.add(button18);
        row10.add(button19);row10.add(button20);
        row11.add(button21);row11.add(button22);
        row12.add(button23);row12.add(button24);

        rowList.add(row1);rowList.add(row2);rowList.add(row3);rowList.add(row4);rowList.add(row5);rowList.add(row6);
        rowList.add(row7);rowList.add(row8);rowList.add(row9);rowList.add(row10);rowList.add(row11);rowList.add(row12);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage hatchBackUz(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Xetchbekni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        List<KeyboardRow> rowList = new ArrayList<>();

        button1.setText("Neta S");
        button2.setText("Neta Gt");
        button3.setText("Zeeker 007");
        button4.setText("⬅️Orqaga");

        row1.add(button1);row1.add(button2);
        row2.add(button3);row2.add(button4);

        rowList.add(row1);rowList.add(row2);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendMessage minivanUz(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Mikroavtobusni tanlang");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button1.setText("Denza D9");
        button2.setText("Zeeker 009");
        button3.setText("⬅️Orqaga");

        row.add(button1);row.add(button2);
        row1.add(button3);

        rowList.add(row);rowList.add(row1);

        replyKeyboardMarkup.setKeyboard(rowList);
        replyKeyboardMarkup.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkup);

        return sendMessage;
    }
    public SendPhoto aboutUsUz(Long chatId) {

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/images/content/about-01.webp"));
        sendPhoto.setCaption("<b>BIZ HAQIMIZDA</b>\n" +
                "<b>Butun dunyo bo'ylab logistika xizmatlari sohasida tajriba</b>\n" +
                "\n" +
                "Biz butun dunyo bo'ylab eng yaxshi yuk tashish va transport bitimlarini taqdim etishdan faxrlanamiz." +
                " \n" +
                "✅100%Kompensatsiya          ✅Onlayn kuzatish\n" +
                "✅Tajribali jamoa            ✅Yuklarni sug'urta qilish\n" +
                "✅24/7 qo'llab-quvvatlash    ✅Xavfsiz omborxona");

        return sendPhoto;
    }
}


































































































































































































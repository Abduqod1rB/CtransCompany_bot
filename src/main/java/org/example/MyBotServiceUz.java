package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/9/2024 *Time:9:24 AM
 */

import org.telegram.telegrambots.meta.api.methods.ParseMode;
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
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();

        button.setText("✈️Havo transporti");
        button1.setText("\uD83D\uDE88Temir yo'l transporti");
        button2.setText("\uD83D\uDE98Avtomobil transporti");
        button3.setText("⬅️Orqaga");

        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);

        rows.add(row);
        rows.add(row1);

        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage xizmatlar(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Xizmat turini tanlang");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();
        KeyboardButton button3 = new KeyboardButton();
        KeyboardButton button4 = new KeyboardButton();
        KeyboardButton button5 = new KeyboardButton();
        KeyboardButton button6 = new KeyboardButton();

        button1.setText("✈️Havo transporti");
        button2.setText("\uD83D\uDE98Avtomobil transporti");
        button3.setText("\uD83D\uDE88Temir yo'l transporti");
        button4.setText("Yivu va Guanchjou da ombor xizmatlari");
        button5.setText("Bojxona rasmiylashtiruvi xizmatlari");
        button6.setText("⬅️Orqaga");

        row.add(button1);
        row.add(button2);
        row1.add(button3);
        row1.add(button4);
        row2.add(button5);
        row3.add(button6);

        rowList.add(row);
        rowList.add(row1);
        rowList.add(row2);
        rowList.add(row3);

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
        sendMessage.setText("Mashina turini tanlang");
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
    public SendPhoto BYD_SEAL(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/GbnFoweKIIJ8SGRcR3X1qaBAmgizk9E8798rn536.webp"));
        sendPhoto.setCaption("<b>Brend: BYD\nModel: Seal\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Batareya quvvati, kVt: 82,5\n" +
                "✅Quvvat zahirasi (NEDC), km: 650\n" +
                "✅Tezlashuv 0-100 km, sek: 3,8\n" +
                "✅Joylar soni: 5\n" +
                "✅Quvvat, kVt/hp: 390/530\n" +
                "✅Maksimal tezlik, km/soat: 180\n" +
                "✅Haydovchi blok: To'liq\n" +
                "✅Zaryadlash tezligi (sekin/tez), soat: 11,8/0,5");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto BYD_HAN(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/G5LEALmmX7YN3h2S0ejHxggKreWq0hgj0rkNV3zI.webp"));
        sendPhoto.setCaption("<b>Brend: BYD\nModel: Han\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Batareya quvvati, kVt: 85,4\n" +
                "✅Quvvat zahirasi (NEDC), km: 610\n" +
                "✅Tezlashuv 0-100 km, sek: 3,9\n" +
                "✅Joylar soni: 5\n" +
                "✅Quvvat, kVt/hp: 380/517\n" +
                "✅Maksimal tezlik, km/soat: 185\n" +
                "✅Haydovchi blok: To'liq\n" +
                "✅Zaryadlash tezligi (sekin / tez), soat: 12,2/0,5");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto Chevrolet_Monza15(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/7XZX6Aa66UBk54V6XkdOikpRj7MaSpDsfdPEecaw.webp"));
        sendPhoto.setCaption("<b>Brend: Chevrolet\nModel: Monza 1.5L Atmo\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Dvigatel: 1.5 L (113 ot kuchi)\n" +
                "✅Yoqilg'i turi: Benzin\n" +
                "✅Uzatish qutisi: 6-AT (robot)\n" +
                "✅Haydovchi blok: To'liq\n" +
                "✅Tezlashuv (0-100 km/soat): 12.9 s\n" +
                "✅Joylar soni: 5");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto Chevrolet_Monza13(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/7XZX6Aa66UBk54V6XkdOikpRj7MaSpDsfdPEecaw.webp"));
        sendPhoto.setCaption("<b>Brend: Chevrolet\nModel: Monza 1.3L Turbo\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Dvigatel: 1.3L Turbo (163 ot kuchi)\n" +
                "✅Yoqilg'i turi: Benzin\n" +
                "✅Uzatish qutisi: 6-AT (robot)\n" +
                "✅Haydovchi blok: To'liq\n" +
                "✅Tezlashuv (0-100 km/soat): 9.2 s\n" +
                "✅Joylar soni: 5");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto Honda_Crider10_Turo(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/WWWDezhpGgYHzzR9VApgwmj9eeNyNtW7OAlYygCk.webp"));
        sendPhoto.setCaption("<b>Brend: Honda\nModel: Crider 1.0L Turbo\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Dvigatel hajmi: 1.0 L Turbo\n" +
                "✅Quvvat: 122 ot kuchi\n" +
                "✅Dvigatel turi: Benzin\n" +
                "✅100 ga tezlashtirish: 10.7 s\n" +
                "✅Iste'mol: 5.0 L");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto LeapMotor_C01(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/gAvBM75WivxQrmjUD4oBWpXvhS0MjkTfLEvz2v5d.webp"));
        sendPhoto.setCaption("<b>Brend: LeapMotor\nModel: C01\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Batareya quvvati, kVt: 90\n" +
                "✅Quvvat zahirasi (NEDC), km: 630\n" +
                "✅Tezlashuv 0-100 km, sek: 3,6\n" +
                "✅Joylar soni: 5\n" +
                "✅Quvvat, kVt/hp: 400/544\n" +
                "✅Maksimal tezlik, km/soat: 180\n" +
                "✅Haydovchi blok: To'liq");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto HiPhi_Z(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/TmaFh6qeILQV09RdIovwNghxCrx9BASiaMFvgdO9.webp"));
        sendPhoto.setCaption("<b>Brend: HiPhi\nModel: Z\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Batareya quvvati, kVt: 120\n" +
                "✅Quvvat zahirasi (NEDC), km: 705\n" +
                "✅Tezlashuv 0-100 km, sek: 3,8\n" +
                "✅Joylar soni: 4\n" +
                "✅Quvvat, kVt/hp: 494/672\n" +
                "✅Maksimal tezlik, km/soat: 200\n" +
                "✅Haydovchi blok: To'liq\n" +
                "✅Zaryadlash tezligi (sekin / tez), soat: 12,4/0,92");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto IM_Motors_L7(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/n7IgJoqfWsM0w5ljA24sr0wBGUq7lrUp3g9bb5wi.webp"));
        sendPhoto.setCaption("<b>Brend: IM Motors\nModel: L7\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Batareya quvvati, kVt: 90\n" +
                "✅Zaxira quvvati, km: 615\n" +
                "✅Tezlashuv 0-100 km, sek: 3,7\n" +
                "✅Joylar soni: 5\n" +
                "✅Quvvat: 445kVt / 605Nm\n" +
                "✅Maksimal tezlik, km/soat: 200\n" +
                "✅Haydovchi blok: Toʻliq");
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto Geometry_G6(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/Zl6MhKhdsf1r5CfqLELkB4DnHjaliEh4XoTU6I56.webp"));
        sendPhoto.setCaption("<b>Brend: Geometry\nModel: G6\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "✅Batareya quvvati, kVt: 70\n" +
                "✅Zaxira quvvati, km: 580\n" +
                "✅Tezlashuv 0-100 km, sek: 6,9\n" +
                "✅Joylar soni: 5\n" +
                "✅Quvvat: 150 kVt / 204Nm\n" +
                "✅Maksimal tezlik, km/soat: 150\n" +
                "✅Haydovchi blok: Old"
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto BMW_i3_eDrive40(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/eQXmyVoEXPqMbHTXPKK2SrtMvKeFYs9BkaYGTs70.webp"));
        sendPhoto.setCaption("<b>Brend: BMW\nModel: i3 eDrive40\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Batareya quvvati, kVt: 78,92\n" +
                "✅Quvvat zahirasi (NEDC), km: 592\n" +
                "✅Tezlashuv 0-100 km, sek: 5,6\n" +
                "✅Joylar soni: 5\n" +
                "✅Quvvat, kVt/hp: 250/340\n" +
                "✅Maksimal tezlik, km/soat: 180\n" +
                "✅Haydovchi blok: orqa\n" +
                "✅Zaryadlash tezligi (sekin / tez), soat: 7,5/0,68\n"
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto BMW_i4_eDrive35(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/gwvcNdDemXzj2KnSzE4KnrAiEQbr722zUqpkNwsw.webp"));
        sendPhoto.setCaption("<b>Brend: BMW\nModel: i4 eDrive35\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Batareya quvvati, kVt: 83,9\n" +
                "✅Zaxira quvvati, km: 625\n" +
                "✅Tezlashuv 0-100 km, sek: 5,7\n" +
                "✅Joylar soni: 5\n" +
                "✅Quvvat: 250kVt / 340Nm\n" +
                "✅Maksimal tezlik, km/soat: 182\n" +
                "✅Haydovchi blok: Toʻliq"
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto BMW_i5_eDrive40(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/5Pkx8cb6yJEhEPsJdXDBzEmfVDOr361aBdZILSLb.webp"));
        sendPhoto.setCaption("<b>Brend: BMW\nModel: i5 eDrive40\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Batareya quvvati, kVt: 81.2\n" +
                "✅Zaxira quvvati, km: 582\n" +
                "✅Tezlashuv 0-100 km, sek: 6\n" +
                "✅Joylar soni: 5\n" +
                "✅Quvvat: 340kVt / 586Nm\n" +
                "✅Maksimal tezlik, km/soat: 193\n" +
                "✅Haydovchi blok: Toʻliq"
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto Neta_S(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/fktgieIK4VYEVFIP0uN36tNjxRymXuAX2LIluq2Q.webp"));
        sendPhoto.setCaption("<b>Brend: Neta\nModel: S\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Batareya quvvati, kVt: 91\n" +
                "✅Quvvat zahirasi (NEDC), km: 715\n" +
                "✅Tezlashuv 0-100 km, sek: 3,9\n" +
                "✅Joylar soni: 5\n" +
                "✅Quvvat, kVt/hp: 340/462\n" +
                "✅Maksimal tezlik, km/soat: 185\n" +
                "✅Haydovchi blok: To'liq\n" +
                "✅Zaryadlash tezligi (sekin / tez), soat: 17/0,58"
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto Neta_Gt(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/7fdWbQK8rsxAid456F7zwCFsqAIcKaibwZH1rMVS.webp"));
        sendPhoto.setCaption("<b>Brend: Neta\nModel: GT\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Batareya quvvati, kVt: 74.5\n" +
                "✅Quvvat zahirasi (NEDC), km: 650\n" +
                "✅Joylar soni: 4\n" +
                "✅Quvvat, kVt/hp: 170\n" +
                "✅Maksimal tezlik, km/soat: 190\n" +
                "✅Haydovchi blok: orqa"
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    public SendPhoto Zeekr_007(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/o81wp9OhfwgTCIkaXwEoFqhO0Dsgxx7Mh3VDFw47.webp"));
        sendPhoto.setCaption("<b>Brend: Zeekr\nModel: 007\nTurkum: Sedan\nNarxi: Договорная</b>\n\n" +
                "<b>Xususiyatlari:</b>\n" +
                "✅Batareya quvvati, kVt: 70\n" +
                "✅Zaxira quvvati, km: 688\n" +
                "✅Tezlashuv 0-100 km, sek: 2,84\n" +
                "✅Joylar soni: 5\n" +
                "✅Quvvat: 421kVt / 224Nm\n" +
                "✅Maksimal tezlik, km/soat: 210\n" +
                "✅Haydovchi blok: Toʻliq"
        );
        sendPhoto.setParseMode(ParseMode.HTML);
        return sendPhoto;
    }
    //Push and Commit
}
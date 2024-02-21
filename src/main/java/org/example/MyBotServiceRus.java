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
        sendMessage.setText("Главное меню");
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
        button.setText("\uD83D\uDE9AУслуги");
        button1.setText("\uD83D\uDE99Авто из Китая");
        button2.setText("⏰Срок доставки");
        button3.setText("☎️Наши контакты");
        button4.setText("\uD83C\uDFDBКурсы валют");
        button5.setText("\uD83E\uDDEEКалькулятор");
        button6.setText("ℹ️О нас");
        button7.setText("\uD83D\uDCACНаписать комментарий");
        button8.setText("⚙️Настройки");
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
        sendMessage.setText("\uD83D\uDCDE Введите свой номер телефона для регистрации. \n" +
                " \n" +
                "Отправьте номер в виде +998***********.");
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();

        button1.setRequestContact(true);
        button1.setText("☎️\uFE0FОтправить номер телефона");
        row1.add(button1);
        rows.add(row1);

        replyKeyboardMarkUp.setKeyboard(rows);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);

        return sendMessage;
    }

    public SendMessage izohQoldirishRus(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("Оставить комментарий. Ваше мнение важно для нас");
        sendMessage.setChatId(chatId);
        ReplyKeyboardMarkup replyKeyboardMarkUp = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();

        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅️\uFE0FНазад");
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
        sendMessage.setText("✅Ваш комментарий был принят");
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
        KeyboardButton button3 = new KeyboardButton();
        button.setText("✈️\uFE0FАвиаперевозки");
        button1.setText("\uD83D\uDE88Железнодорожные перевозки");
        button2.setText("\uD83D\uDE98Автоперевозки");
        button3.setText("⬅️\uFE0FНазад");
        row.add(button);
        row.add(button1);
        row1.add(button2);
        row1.add(button3);
        rows.add(row);
        rows.add(row1);
        replyKeyboardMarkUp.setKeyboard(rows);
        replyKeyboardMarkUp.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(replyKeyboardMarkUp);
        return sendMessage;
    }
    public SendMessage xizmatlarRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип услуги");
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
        button.setText("✈️ Авиаперевозки");
        button1.setText("\uD83D\uDE98 Автоперевозки");
        button2.setText("\uD83D\uDE88 Железнодорожные перевозки");
        button3.setText("Складовые услуги в Иу и Гуанчжоу");
        button4.setText("Услуги таможеннего оформления");
        button5.setText("⬅️\uFE0FНазад");
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

    public SendMessage carsFromChinaRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите свой тип автомобиля");

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
        button.setText("\uD83D\uDE97Седан");
        button1.setText("\uD83D\uDE97Кросовер");
        button2.setText("\uD83D\uDE97Хетчбек");
        button3.setText("\uD83D\uDE97Минивэн");
        button4.setText("⬅️\uFE0FНазад");
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


    public SendPhoto aboutUsRus(Long chatId) {

        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(new File("D:\\My_Telegram_bots\\CTRANS_bot\\image\\aboutUs.png")));
        sendPhoto.setCaption("""
                О НАС
                Опыт работы в сфере логистических услуг по всему миру.
                
                Мы гордимся тем, что предоставляем лучшие
                предложения по доставке и транспортировке по всему миру.
                
                ✅100 % Компенсации ✅Поддержка 24/7
                ✅Опытная команда  ✅Страхование грузов
                ✅Поддержка 24/7      ✅Безопасный склад""");
        return sendPhoto;
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

        button.setText("\uD83D\uDE97BYD Seal");
        button1.setText("\uD83D\uDE97BYD Han");
        button2.setText("\uD83D\uDE97Chevrolet Monza 1.5L Atmo");
        button3.setText("\uD83D\uDE97Chevrolet Monza 1.3L Turbo");
        button4.setText("\uD83D\uDE97Honda Crider 1.0L Turbo");
        button5.setText("\uD83D\uDE97LeapMotor C01");
        button6.setText("\uD83D\uDE97HiPhi Z");
        button7.setText("\uD83D\uDE97IM Motors L7");
        button8.setText("\uD83D\uDE97Geometry G6");
        button9.setText("\uD83D\uDE97BMW i3 eDrive40");
        button10.setText("\uD83D\uDE97BMW i4 eDrive35");
        button11.setText("\uD83D\uDE97BMW i5 eDrive40");
        button12.setText("\uD83D\uDE97Neta S");
        button13.setText("\uD83D\uDE97Neta Gt");
        button14.setText("\uD83D\uDE97Zeeker 007");
        button15.setText("⬅️Назад");

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

        button.setText("\uD83D\uDE97BYD Song Plus Champion Edition");
        button1.setText("\uD83D\uDE97BYD Tang EV");
        button2.setText("\uD83D\uDE97BYD Yuan Plus EV");
        button3.setText("\uD83D\uDE97Zeeker 001");
        button4.setText("\uD83D\uDE97Zeeker X");
        button5.setText("\uD83D\uDE97LeapMotor C11");
        button6.setText("\uD83D\uDE97Geely Geometry E");
        button7.setText("\uD83D\uDE97Denza N7");
        button8.setText("\uD83D\uDE97HiPhi Y");
        button9.setText("\uD83D\uDE97NIO ES8");
        button10.setText("\uD83D\uDE97NIO EC7");
        button11.setText("\uD83D\uDE97LI Auto L7");
        button12.setText("\uD83D\uDE97LI Auto L9");
        button13.setText("\uD83D\uDE97IM Motors LS7");
        button14.setText("\uD83D\uDE97Geometry M6");
        button15.setText("\uD83D\uDE97LI Auto L8");
        button16.setText("\uD83D\uDE97Avatr 11");
        button17.setText("\uD83D\uDE97HiPhi X");
        button18.setText("\uD83D\uDE97LI Auto One");
        button19.setText("\uD83D\uDE97Lynk&Co 09EM-P");
        button20.setText("\uD83D\uDE97Chevrolet Seeker");
        button21.setText("\uD83D\uDE97BYD Song L");
        button22.setText("\uD83D\uDE97BYD Yangwang U8");
        button23.setText("⬅️Назад");


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
    public SendMessage minivanRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип минивэна");

        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();

        button.setText("Denza D9");
        button1.setText("Zeeker 009");
        button2.setText("⬅️\uFE0FНазад");

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

    public SendMessage xetchBackRus(Long chatId) {

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Выберите тип хэтчбека");

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

        button.setText("\uD83D\uDE97BYD Seagull");
        button1.setText("\uD83D\uDE97BYD Dolphin");
        button2.setText("\uD83D\uDE97BYD E2");
        button3.setText("\uD83D\uDE97Changan BenBen E-Star");
        button4.setText("⬅️Назад");

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



    public SendPhoto havotransportiRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://api.360tv.ru/get_resized/-95SAJCmVKUbkPUC2f6RxCyVqbk=/1080x607/filters:focal(0.5:0.5):format(webp)/YXJ0aWNsZXMvaW1hZ2UvMjAyNC8xLzI1NjM3ODQ5NTA5ODc2NTQuanBn.webp"));
        sendPhoto.setCaption("""
                Компания CTRANS предлагает авиаперевозки широкого спектра товаров с большими габаритами и весом. Авиаперевозки Китай-Узбекистан выбор большинства Узбекистанцев. Мы гарантируем вам быструю, безопасную, и качественную перевозку за минимальный срок.

                Сотрудники CTRANS бережно относятся и контролируют перевозку каждого товара. С нами вы будете уверены, что ваш товар прибудет в целости и сохранности.""");
        return sendPhoto;
    }

    public SendPhoto avtomobiltransportiRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRDsXg7vSpcNXJi0JIR5i2zfNXzawFxcAWNbJG3ojAqmvaNcmB5"));
        sendPhoto.setCaption("""
                Грузоперевозки автомобильным транспортом являются важнейшей составной рынка транспортных услуг, причем именно это направление считается лидером в сфере транспортировки  грузов от отправителя к получателю

                По сравнению с другими видами транспорта, за автотранспортом сегодня остаются серьезные приоритеты. Среди достоинств, которыми обладают автотранспортные грузоперевозки

                маневренность широкие возможности для логистической компании составлять наиболее выгодные маршруты следования оперативность доставки широкий спектр перевозимых товаров
                формирование сборных автомобильных грузов, объединяющих посылки от нескольких компаний большой выбор средств передвижения с учетом таких факторов, как вес, формат и габариты поклажи, наличие легковоспламеняемых товаров и быстропортящихся продуктов
                """);
        return sendPhoto;
    }
    public SendPhoto railwayTransportationRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS7EI3DngKarj1R1HwVvbhjoGzmDIrSBj1OvdnLkYnlu37ZUjMF"));
        sendPhoto.setCaption("""
                Железнодорожные перевозки — одно из главных направлений деятельности CTRANS. Компанией осуществляется транспортировка как контейнерами нужного тоннажа, так и всеми видами вагона. 
                               
                Контейнерные перевозки позволят выполнить бесперегрузочную доставку товаров. Так значительно сокращается объём и увеличивается скорость промежуточных погрузочно-разгрузочных работ.
                                
                Железнодорожные перевозки — отличный выбор, если вы цените низкую стоимость транспортировки. Невысокая стоимость в данном случае обусловлена высокой грузоподъёмностью.
                
                """);

        return sendPhoto;
    }
    public SendPhoto werehouseRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://fkplatforma.ru/wp-content/uploads/2023/05/img-7.png"));
        sendPhoto.setCaption("""

                CTRANS предлагает услуги одновременной складской логистики в Китае, а также перевозки автомобилей из Китая.
                
                В крупных городах, таких как Иу и Гуанчжоу, развита торговля.
                
                Наши склады расположены в удобных местах города, чтобы нашим клиентам было удобнее экономить на хранении и доставке товара.
                
                """);

        return sendPhoto;
    }

    public SendPhoto ccsRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://wittysparks.com/wp-content/uploads/2019/12/custom-agents-checking.jpg"));
        sendPhoto.setCaption("""

                Компания CTRANS ценит время своих клиентов и предлагает услуги по таможенному декларированию грузов. Определение кодов TIF TN.
                                
                Таможенное оформление необходимо для оформления всей информации, касающейся товара, оформления и формирования комплекта документов с достоверной информацией о нем.
                                                                
                Не хотите, чтобы ваш багаж «болтался» где-то на полпути? Нам, конечно, не хочется, поэтому мы предлагаем нашим клиентам услугу таможенного оформления.
                                                                                                                                                              
                Обратившись в Ctrans, вы можете быть уверены в нашем профессионализме и в том, что окончательная цена товара не изменится после таможенного оформления. Мы поможем Вам пройти стоимость товара дешево и быстро, без непредвиденных расходов, через таможенный контроль.
                
                """);

        return sendPhoto;
    }





    public SendMessage settingsRus (Long chatId){

        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("⚙️Настройки");
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();

        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();

        KeyboardButton button = new KeyboardButton();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardButton button2 = new KeyboardButton();

        button.setText("\uD83C\uDDF7\uD83C\uDDFAИзменить язык");
        button1.setText("☎️Изменить номер телефона");
        button2.setText("⬅️ Назад");
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
    public SendPhoto bydSealRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/GbnFoweKIIJ8SGRcR3X1qaBAmgizk9E8798rn536.webp"));
        sendPhoto.setCaption("""
                🏎BYD Seal
                
                ✅Емкость батареи, кВт: 82,5
                ✅Разгон 0-100 км, сек: 3,8
                ✅Мощность, кВт/л.с: 390/530        
                ✅Привод: Полный              
                ✅Запас хода (NEDC), км: 650
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
                ✅Скорость зарядки (медленная/быстрая), час: 11,8/0,5
                
                BYD Seal – это компактный электрический седан представительского класса, выпускаемый компанией BYD Auto. BYD Seal построен на платформе e-Platform 3.0, новой 800-вольтовой автомобильной платформе BYD.
                """);

        return sendPhoto;
    }

    public SendPhoto bydHanRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/G5LEALmmX7YN3h2S0ejHxggKreWq0hgj0rkNV3zI.webp"));
        sendPhoto.setCaption("""
               🏎BYD Han
                
                ✅Емкость батареи, кВт: 85,4    
                ✅Разгон 0-100 км, сек: 3,9
                ✅Мощность, кВт/л.с: 380/517     
                ✅Привод: Полный             
                ✅Запас хода (NEDC), км: 610
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 185
                ✅Скорость зарядки (медленная/быстрая), час: 12,2/0,5
                
               BYD Han может похвастаться красивым, стильным, самобытным и презентабельным видом – хищный перед с узкими фарами и рельефным бампером, солидный силуэт с длинным капотом, выразительными бортами и небольшим «хвостиком» багажника, изящная корма со стильными фонарями.
                """);

        return sendPhoto;
    }

    public SendPhoto chevroletMonzaAtmoRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/7XZX6Aa66UBk54V6XkdOikpRj7MaSpDsfdPEecaw.webp"));
        sendPhoto.setCaption("""
                🏎Chevrolet Monza 1.5L Atmo
                
                ✅Двигатель: 1.5 л (113 л.с.)
                ✅Коробка передач: 6-AT (Робот)
                ✅Разгон (0-100 км/час): 12.9 с     
                ✅Тип топлива: Бензин               
                ✅Привод: Полный
                ✅Количество мест: 5
               
                Chevrolet Monza седан, новая модель 2023 года, передний привод. Бензиновый двигатель — 1, 5 литра, мощностью 113 лошадиных сил, 6-ступенчатая автоматическая коробка передач.     
                """);

        return sendPhoto;
    }

    public SendPhoto chevroletMonzaTurboRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/b3iKeMlJtqB2tNlBX4F9UYXbWLtrXRqJiD9ht8Sm.webp"));
        sendPhoto.setCaption("""
                🏎Chevrolet Monza 1.3L Turbo
                
                ✅Двигатель: 1.3л Турбо (163 л.с.)
                ✅Коробка передач: 6-AT (Робот)
                ✅Разгон (0-100 км/час): 9.2 с      
                ✅Тип топлива: Бензин             
                ✅Привод: Полный
                ✅Количество мест: 5
               
                Chevrolet Monza седан, новая модель 2023 года, передний привод. Бензиновый двигатель — 1,3 литра (Турбо), мощностью 163 лошадиных сил, 6-ступенчатая автоматическая коробка передач.           
                """);

        return sendPhoto;
    }

    public SendPhoto HondaCriderTurboRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/WWWDezhpGgYHzzR9VApgwmj9eeNyNtW7OAlYygCk.webp"));
        sendPhoto.setCaption("""
                🏎Honda Crider 1.0L Turbo
                
                ✅Объем двигателя: 1.0 л Turbo  
                ✅Тип двигателя: Бензиновый
                ✅Расход: 5.0 л  
                ✅Мощность: 122 л.с.               
                ✅Разгон до 100: 10.7 с
               
                Honda Crider – седан C-класса, передний привод. Бензиновые двигател мощностью 122 лошадиных сил.
                """);

        return sendPhoto;
    }

    public SendPhoto leapMotorC01Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/gAvBM75WivxQrmjUD4oBWpXvhS0MjkTfLEvz2v5d.webp"));
        sendPhoto.setCaption("""
                🏎LeapMotor C01
                
                ✅Емкость батареи, кВт: 90
                ✅Разгон 0-100 км, сек: 3,6
                ✅Мощность, кВт/л.с: 400/544
                ✅Привод: Полный              
                ✅Запас хода (NEDC), км: 630
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
               
                Leapmotor C01 Продвинься в своей жизни – Электромобиль с технологией Deluxe где присутствует интеграция инновационных технологий для мягкого и элегантного внешнего вида. Ориентация на высокое качество и удовлетворение различных потребностей.
                """);

        return sendPhoto;
    }

    public SendPhoto HiPhiZRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/TmaFh6qeILQV09RdIovwNghxCrx9BASiaMFvgdO9.webp"));
        sendPhoto.setCaption("""
                🏎HiPhi Z
                
                ✅Емкость батареи, кВт: 120
                ✅Разгон 0-100 км, сек: 3,8
                ✅Мощность, кВт/л.с: 494/672
                ✅Привод: Полный
                ✅Запас хода (NEDC), км: 705
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 200
                ✅Скорость зарядки (медленная/быстрая), час: 12,4/0,92             
                
                Добро пожаловать в будущее автомобильной индустрии! Представляем вам HiPhi Z – воплощение передовых технологий и несравненного стиля, переопределяющее понятие современной автомобильной мечты. Соединяя элегантность и инновации, HiPhi Z воплощает изысканный дизайн, который вызывает истинное восхищение на первый взгляд. Гармонично сочетая гладкие, изящные линии с эффектными деталями, этот автомобиль создан для того, чтобы привлекать внимание на дороге и оставаться воплощением современного автодизайна на долгие.
                """);

        return sendPhoto;
    }

    public SendPhoto imMotorsL7Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/n7IgJoqfWsM0w5ljA24sr0wBGUq7lrUp3g9bb5wi.webp"));
        sendPhoto.setCaption("""
                🏎IM Motors L7
                
                ✅Емкость батареи, кВт: 90
                ✅Разгон 0-100 км, сек: 3,7
                ✅Мощность: 445кВт / 605Нм
                ✅Привод: Полный
                ✅Запас хода, км: 615
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200         

                Zhiji Auto – это бренд, созданный совместно SAIC Group, Zhangjiang Hi-Tech и Alibaba Group. Его Zhiji L7 представляет собой полностью электрический автомобиль седан представительского класса, размер с колесной базой 3 100 мм и двухмоторной системой, разгон до 100 км/ч всего за 3,9 секунды. Электромобиль Zhiji L7 имеет длину, ширину и высоту 5098/1960/1485 мм и колесную базу 3100 мм. Коэффициент лобового сопротивления 0,21.
                """);

        return sendPhoto;
    }

    public SendPhoto geometryG6Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/Zl6MhKhdsf1r5CfqLELkB4DnHjaliEh4XoTU6I56.webp"));
        sendPhoto.setCaption("""
                🏎Geometry G6
                
                ✅Емкость батареи, кВт: 70
                ✅Разгон 0-100 км, сек: 6,9
                ✅Мощность: 150 кВт / 204Нм
                ✅Привод: Передний
                ✅Запас хода, км: 580
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 150

                Передняя часть автомобиля получила закрытую решетку радиатора, а под капотом установлен светящийся логотип Geely Logo. Главная оптика модели имеет острую форму. Также следует отметить использование скрытых дверных ручек и пятиспицевых колесных дисков. Группа фар G6 имеет неправильную форму и соединена черной декоративной полосой, образуя проникающий дизайн.
                """);

        return sendPhoto;
    }

    public SendPhoto bmwi3eDrive40Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/eQXmyVoEXPqMbHTXPKK2SrtMvKeFYs9BkaYGTs70.webp"));
        sendPhoto.setCaption("""
                🏎BMW i3 eDrive40
                
                ✅Емкость батареи, кВт: 78,92
                ✅Разгон 0-100 км, сек: 5,6
                ✅Мощность, кВт/л.с: 250/340
                ✅Привод: задний
                ✅Запас хода (NEDC), км: 592
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
                ✅Скорость зарядки (медленная/быстрая), час: 7,5/0,68
                
                BMW i3 представляет собой бескомпромиссное и привлекательное решение для персональных требований мобильности настоящего и будущего в городских районах. Первый в мире автомобиль премиум-класса, специально разработанный для работы исключительно на электрической энергии – и, следовательно, без выбросов.
                """);

        return sendPhoto;
    }

    public SendPhoto bmwi4eDrive35Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/gwvcNdDemXzj2KnSzE4KnrAiEQbr722zUqpkNwsw.webp"));
        sendPhoto.setCaption("""
                🏎BMW i4 eDrive35
                
                ✅Емкость батареи, кВт: 83,9
                ✅Разгон 0-100 км, сек: 5,7
                ✅Мощность: 250кВт / 340Нм
                ✅Привод: Полный
                ✅Запас хода, км: 625
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 182

                BMW i4, являющийся первым электрокаром Gran Coupe, отличная динамика, высокая комфортность и отличные качества для ежедневного использования. Пятидверную вариацию создали, основываясь на примере пятого поколения привода BMW eDrive, и это новое произведение отличается спортивностью. Мощность машины составляет 400 кВт (544 л.с.). Запас хода до 590 километров и пять полноценных мест делает его идеальным спутником в любой поездке.
                """);

        return sendPhoto;
    }

    public SendPhoto bmwi5eDrive40Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/5Pkx8cb6yJEhEPsJdXDBzEmfVDOr361aBdZILSLb.webp"));
        sendPhoto.setCaption("""
                🏎BMW i5 eDrive40
                
                ✅Емкость батареи, кВт: 81.2
                ✅Разгон 0-100 км, сек: 6
                ✅Мощность: 340кВт / 586Нм
                ✅Привод: Полный
                ✅Запас хода, км: 582
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 193

                Первый полностью электрический представительский седан BMW 5-й серии, BMW i5, основан на платформе CLAR. Так что это не чисто электрическая модель. Но есть несколько новых функций, которые могут заставить вас забыть о старых основах. Во-первых, «бизнес» седан BMW теперь предлагает игровой опыт! Она называется Air Console, и на ней уже доступно около 15 игр.
                """);

        return sendPhoto;
    }

    public SendPhoto netaSRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/fktgieIK4VYEVFIP0uN36tNjxRymXuAX2LIluq2Q.webp"));
        sendPhoto.setCaption("""
                🏎Neta S
                
                ✅Емкость батареи, кВт: 91
                ✅Разгон 0-100 км, сек: 3,9
                ✅Мощность, кВт/л.с: 340/462
                ✅Привод: Полный
                ✅Запас хода (NEDC), км: 715
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 185
                ✅Скорость зарядки (медленная/быстрая), час: 17/0,58

                Идеальное сочетание технологического интеллекта и спортивной эстетики. Сверхразумная помощь при вождении. Талантливый, ведущий новый опыт разумных путешествий Прикоснись к очень молодому и умному автомобилю.
                """);

        return sendPhoto;
    }

    public SendPhoto netaGtRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/7fdWbQK8rsxAid456F7zwCFsqAIcKaibwZH1rMVS.webp"));
        sendPhoto.setCaption("""
                🏎Neta GT
                
                ✅Емкость батареи, кВт: 74.5
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 190
                ✅Запас хода (NEDC), км: 650
                ✅Мощность, кВт/л.с: 170
                ✅Привод: задний
                
                Китайская фирма Hozon Auto представила электрическое двухдверное купе Neta GT. Новинка имеет атлетичный дизайн экстерьера и в первую очередь примечательна необычным исполнением головной оптики.
                                                                                
                Блоки фар модели имеют форму бумерангов и далеко заходят на передние крылья. А еще в глаза бросается мускулистый капот с парой эффектных вставок.
                """);

        return sendPhoto;
    }

    public SendPhoto zeeker007Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/public/storage/cars/o81wp9OhfwgTCIkaXwEoFqhO0Dsgxx7Mh3VDFw47.webp"));
        sendPhoto.setCaption("""
                🏎Zeeker 007
                
                ✅Емкость батареи, кВт: 70
                ✅Разгон 0-100 км, сек: 2,84
                ✅Мощность: 421кВт / 224Нм
                ✅Привод: Полный
                ✅Запас хода, км: 688
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 210

                На автосалоне в Гуанчжоу состоялась официальная премьера электромобиля Zeekr 007. Это первый седан китайской марки, принадлежащей концерну Geely. При длине 4865 мм автомобиль сравним с Tesla Model 3.Стоимость новинки составила 229 900 юаней, причем при внесении предоплаты дается скидка в 6 тыс. юаней. Таким образом цена снижается до примерно 31 тыс. долларов или 2,75 млн руб. За первые 30 минут после старта приема предзаказов их поступило более 5 тыс.
                """);

        return sendPhoto;
    }



                 //Krossover





    public SendPhoto BYDSongPlusChampionEditionRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/6xKSj76RdxhSGrindKkIbsV6J4MZJeI4bhF7SvK9.webp"));
        sendPhoto.setCaption("""
                🚙BYD Song Plus Champion Edition
                
                ✅Емкость батареи: 87,04 кВтч
                ✅Дисплей: 15,6" мультимедиа
                ✅Функция караоке: Есть        
                ✅Количество мест: 5         
                ✅Максимальная скорость, км/ч: 175
                ✅Запас хода (NEDC): 605 км
                ✅Автоматическая парковка: Есть
                ✅Разгон 0-100 км, сек: 8,5
                ✅Мощность, кВт/л.с: 160/218
                ✅Привод: Передний
                
                Song PLUS позиционируется как широкий внедорожник с размерами: 4705/1890/1680 мм и колесной базой 2765 мм, что делает его самым широким внедорожником в своем классе, обеспечивающим комфортное вождение. Благодаря усовершенствованной и эффективной системе воздухозаборника, усовершенствованной системе сгорания и более интеллектуальной системе теплового управления мощность и крутящий момент автомобиля были увеличены на 20%. Общая тепловая эффективность двигателя была улучшена на 38%, а максимальная эффективность трансмиссии достигает 95%, при этом потребление топлива уменьшено на 15% на 100 км, сочетая мощность и экономию топлива.
                """);

        return sendPhoto;
    }
    public SendPhoto BYDTangEVRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/MkAX3VNbdNuNqsWJvz3KZgyK1QJVGJpxOcf6rIRP.webp"));
        sendPhoto.setCaption("""
                🚙BYD Tang EV
                
                ✅Емкость батареи, кВт: 108,8
                ✅Разгон 0-100 км, сек: 4,4
                ✅Мощность, кВт/л.с: 380/517        
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 635
                ✅Количество мест: 7
                ✅Максимальная скорость, км/ч: 180
                ✅Скорость зарядки (медленная/быстрая), час: 16,5/0,5
                
                BYD Tang – это среднеразмерный кроссовер, второе поколение которого выпускается с 2018 года в Китае. Машина длиной 4,87 метра может иметь пять или семь мест в салоне. Кроссовер имеет выразительный внешний вид, созданный под руководством Вольфганга Эггера, бывшего шеф-дизайнера компаний Alfa Romeo и Audi.
                """);

        return sendPhoto;
    }
    public SendPhoto BYDYuanPlusEVRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/GkibsVTK9z55KFCWHnci3A7xZgKGMydhoHGKIdjy.webp"));
        sendPhoto.setCaption("""
                🚙BYD Yuan Plus EV
                
                ✅Емкость батареи, кВт: 60.5
                ✅Разгон 0-100 км, сек: 7,3
                ✅Мощность, кВт/л.с: 150/204        
                ✅Привод: Передний         
                ✅Запас хода (NEDC), км: 510
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 160
                ✅Скорость зарядки (медленная/быстрая), час: 8,64/0,5
                
                BYD Yuan Plus – это полностью электрический кроссовер, вмещающий пять человек. Впервые он был продемонстрирован еще в августе 2021 года. Автомобиль базируется на своей платформе BYD 3.0. Yuan Plus получил новейший дизайн Dragon Face 3.0. Габариты автомобиля составляют 4455×1875×1615 мм при колесной базе 2720 мм. Он позиционируется как компактный внедорожник, при этом авто получило большую колесную базу, что обеспечивает достаточно много места для посадки в салоне.
                """);

        return sendPhoto;
    }
    public SendPhoto Zeekr001Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/SWxFK8ht6WR0bB2HfhCw1xlONX9RjAN5RuZG18fm.webp"));
        sendPhoto.setCaption("""
                🚙Zeekr 001
                
                ✅Запас хода (NEDC), км: 650
                ✅Емкость батареи, кВтч: 100
                ✅Мощность, кВт/л.с: 400/544
                ✅Привод: Полный         
                ✅Разгон 0-100 км, сек: 3,8
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200
                
                Zeekr 001 – первый электромобиль, производимый Geely под брендом Zeekr. Автомобиль был выпущен в Китае в октябре 2021 года. Zeekr 001 изначально был представлен концептом Lynk&Co Zero. Его дизайн похож на Porsche Panamera.
                """);

        return sendPhoto;
    }
    public SendPhoto ZeekrXRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/41pwueDIG22eJtsPOvQvNm4Cx7tR9nkoSM1VAT2o.webp"));
        sendPhoto.setCaption("""
                🚙Zeekr X
                
                ✅Запас хода (NEDC), км: 500
                ✅Емкость батареи, кВтч: 66
                ✅Мощность, кВт/л.с: 315/428        
                ✅Привод: Полный        
                ✅Разгон 0-100 км, сек: 3,8
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 190
                
                ZEEKR X – Интерпретация современной эстетики с городским вдохновением, открывая новые возможности для будущего вождения. Экстремальные линии и чистая красота подрывают традиционную эстетику SUV.
                """);

        return sendPhoto;
    }
    public SendPhoto LeapMotorC11Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/aucwGVtBiLRBOpBhJj3qMhb8oQ7ztlh0bvB5zI3Y.webp"));
        sendPhoto.setCaption("""
                🚙LeapMotor C11
                
                ✅Емкость батареи, кВт: 90
                ✅Разгон 0-100 км, сек: 4,5
                ✅Мощность, кВт/л.с: 400/544       
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 580
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200

                Китайская компания Leap Motor представила в Гуанчжоу электрический кроссовер под названием C11. По размерам и характеристикам новинка похожа на Tesla Model Y, но при этом стоит в полтора раза дешевле. Leap C11 построен на платформе своей разработки, его длина составляет 4745 мм, ширина – 1890 мм, высота – 1635 мм, а размер колесной базы – 2923 мм.
                """);

        return sendPhoto;
    }
    public SendPhoto GeelyGeometryERus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/juAVI9k9BjoAUgS3eVAV5Rc0gREwuRVBFDfginS4.webp"));
        sendPhoto.setCaption("""
                🚙Geely Geometry E
                
                ✅Емкость батареи, кВт: 39,4
                ✅Разгон 0-100 км, сек: 8,8
                ✅Мощность, кВт/л.с: 60/82        
                ✅Привод: Передний         
                ✅Запас хода (NEDC), км: 401
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 102

                Geometry E – новый электромобиль от бренда Geometry, принадлежащего компании Geely. Кроссовер ориентирован на молодых покупателей, которые ценят необычный дизайн, но не могут позволить себе дорогие автомобили.
                """);

        return sendPhoto;
    }
    public SendPhoto DenzaN7Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/wvBTQdrUhyfgKY8S7xqOseeicOmtGL7wLGNnY7E6.webp"));
        sendPhoto.setCaption("""
               🚙Denza N7
                
                ✅Емкость батареи, кВт: 91,3
                ✅Разгон 0-100 км, сек: 3,9
                ✅Мощность, кВт/л.с: 390/530        
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 630
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
                ✅
                
               Denza N7 представляет собой качественное, устойчивое и технологичное средство передвижения, которое соответствует современным требованиям экологически ответственного образа жизни. Его привлекательный дизайн, надежность и передовые технологии делают его прекрасным выбором для тех, кто стремится к комфортному и экологически чистому автомобилю.
                """);

        return sendPhoto;
    }
    public SendPhoto HiPhiYRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/jbLkedyoEHmhdmhGfmWPDhee6a3jqqFgq55GYxq8.webp"));
        sendPhoto.setCaption("""
                🚙HiPhi Y
                
                ✅Емкость батареи, кВт: 115
                ✅Разгон 0-100 км, сек: 4,7
                ✅Мощность, кВт/л.с: 371/505        
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 765
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 190
                
                Автомобиль HiPhi Y - это новаторский пример того, как современные технологии и дизайн могут встретиться в едином автомобильном сущности. Разработанный как электрический кроссовер следующего поколения, HiPhi Y сочетает в себе передовые технологии, экологичность и изысканный стиль. HiPhi Y - это не просто автомобиль, это часть большой экосистемы, предоставляющей пассажирам доступ к разнообразным услугам и возможностям. От развлекательных приложений и облачных сервисов до навигации и обновлений по воздуху - HiPhi Y всегда подключен и готов удовлетворить потребности современного образа жизни.
                """);

        return sendPhoto;
    }
    public SendPhoto NIOES8Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/zQV9rA6sYRm8zNgnxBdtHYdR2XczJUnxElxkOeVc.webp"));
        sendPhoto.setCaption("""
                🚙NIO ES8
                
                ✅Емкость батареи, кВт: 100
                ✅Разгон 0-100 км, сек: 4,1
                ✅Мощность, кВт/л.с: 480/653        
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 605
                ✅Количество мест: 6
                ✅Максимальная скорость, км/ч: 200
                ✅Скорость зарядки (медленная/быстрая), час: 0,5
                
                Переосмысленный, совершенно новый ES8. Грандиозное присутствие, непревзойденная производительность, беспрепятственное пространство, непревзойденный комфорт и увлекательный опыт – все вместе в новом ES8. Этот 6-местный внедорожник вмещает работу, семью и личную жизнь с двумя планировками.
                """);

        return sendPhoto;
    }
    public SendPhoto NIOEC7Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/xoOfzfnOEU35Da860RQf7tmwLu4tmSzHFgbGKESz.webp"));
        sendPhoto.setCaption("""
                🚙NIO EC7
                
                ✅Емкость батареи, кВт: 100
                ✅Разгон 0-100 км, сек: 3,8
                ✅Мощность, кВт/л.с: 480/653       
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 635
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200
                ✅Скорость зарядки (медленная/быстрая), час: 0,33
                
                NIO EC7 - это современный кроссовер. Каждый ракурс и каждая деталь является интерпретацией утонченности. Элегантность происходит от его идеальных размеров, пропорций и осанки. Пропорция придает впечатляюще плавный силуэт фастбэка, одновременно обеспечивая просторный задний ряд. EC7 отличается чистотой дизайна следующего уровня, интегрированной с передовыми технологиями. Настоящая приманка с безупречной практичностью, которая всегда будет в центре внимания, куда бы вы ни поехали.
                """);

        return sendPhoto;
    }
    public SendPhoto LIAutoL7Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://www.ctrans.uz/storage/cars/RNQBVoacpvXjimNtBxZfZDfJN00HVDL6N7XQAM4l.webp"));
        sendPhoto.setCaption("""
                🚙LI Auto L7
                
                ✅Емкость батареи, кВт: 42.8
                ✅Разгон 0-100 км, сек: 5.3
                ✅Мощность: 330 кВт / 620 Нм       
                ✅Запас хода, км: 1315         
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
              
                Li Auto L7 — подзаряжаемый гибрид, в котором трубированный двигатель объёмом 1,5 л заряжает тяговую батарею ёмкостью 42,8 кВт·ч, которая в свою очередь питает передний и задний электромоторы суммарной мощностью 449 л.с. Запас хода полностью заправленного и заряженного кроссовера составляет 1315 км (согласно методике CLTC), пробег на чистом электричестве — до 210 км. До 100 км/ч Li Auto L7 разгоняется за 5,3 с.
                                                                                                                                                                                                                        
                                                                                                                                                                                                                        
                """);

        return sendPhoto;
    }
    public SendPhoto LIAutoL9Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/hYabLzhJzyKeKAmbXydaT5kgK7za47MAZLOQzwO6.webp"));
        sendPhoto.setCaption("""
                🚙LI Auto L9
                
                ✅Емкость батареи, кВт: 44.5
                ✅Разгон 0-100 км, сек: 5.3
                ✅Мощность: 330 кВт / 620 Нм        
                ✅Запас хода, км: 1100         
                ✅Количество мест: 6
                ✅Максимальная скорость, км/ч: 180
   
                Li Auto L9 оснащен огромным 15,7-дюймовым 3K OLED-дисплеем, который служит информационно-развлекательным дисплеем. Пассажиры могут легко управлять сенсорными дисплеями с помощью 3DToF-камер слежения за руками и пальцами. Большой экран второго ряда можно использовать как внешний дисплей для ноутбука или планшета. Мини-информационные экраны на рулевом колесе, полностью регулируемые сиденья второго ряда, проекционный дисплей и голосовое управление — вот некоторые из функций, которые Li Auto интегрировала в свой роскошный внедорожник L9. Под центральной консолью также есть мини-холодильник.
                """);

        return sendPhoto;
    }
    public SendPhoto IMMotorsLS7Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/tpG5urfPNaVYhLY7sEkYmfBYIo63zuWsa88nOq4U.webp"));
        sendPhoto.setCaption("""
                🚙IM Motors LS7
                
                ✅Емкость батареи, кВт: 100
                ✅Разгон 0-100 км, сек: 4,5
                ✅Мощность: 425кВт / 578Нм        
                ✅Привод: Полный         
                ✅Запас хода, км: 625
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200
               
                Воплощение минимализма с L-образными фарами создает неповторимую гармонию дизайна. Смелый шаг вперед, где отсутствует традиционная решетка радиатора и присутствуют встроенные воздухозаборники в бампере. Спокойно и сдержанно сзади установлены узкие фонари, прекрасно сливающиеся в единый блок. Они подчеркивают великолепную эстетику этого автомобиля. Чтобы обеспечить безопасность и комфорт, на этом автомобиле расположена камера с высоким разрешением, а также установлено несколько лидаров, которые предоставляют возможность автопилоту работать с высокой точностью.
                """);

        return sendPhoto;
    }
    public SendPhoto GeometryM6Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/BgJZKJoWenpHEV6sbSeLRzWFmKYN2E9QcxqyFyvM.webp"));
        sendPhoto.setCaption("""
               🚙Geometry M6
                
                ✅Емкость батареи, кВт: 70
                ✅Разгон 0-100 км, сек: 6,9
                ✅Мощность: 150кВт / 204Нм        
                ✅Привод: Передний         
                ✅Запас хода, км: 580
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 150
               
               М6 является представителем сегмента внедорожников, что нашло отражение в соответствующем исполнении. Мускулистый корпус имеет несколько довольно резких выштампованных линий, придающих внешнему виду динамики. Передняя часть оформлена практически в том же стиле, что и G6. Автомобиль получил закрытую решетку радиатора и главную оптику острой формы. Задняя оптика у M6 сквозного типа.
                """);

        return sendPhoto;
    }
    public SendPhoto LIAutoL8Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/jGQVsR2nxeEmeBVuOd07Uo3OffAFU9Ptj5HBw4sU.webp"));
        sendPhoto.setCaption("""
                🚙LI Auto L8
                
                ✅Емкость батареи, кВт: 42.8
                ✅Разгон 0-100 км, сек: 5.5
                ✅Мощность, кВт/л.с: 449        
                ✅Привод: Полный         
                ✅Запас хода (NEDC), км: 1315
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 180
               
                Li L8 брат близнец Li L7. В отличие от «семёрки» этот гибридный кроссовер рассчитан на большую семью. В салоне 3 рада сидений по 2 посадочных места на каждом. Во всех комплектациях на втором ряду два капитанских кресла. Размеры Ли Л8 незначительно изменены: 5080 х 1995 х 1800 мм. Относительно «семёрки» к высоте добавлено 5 см. Видимо, для удобства задних пассажиров
                """);

        return sendPhoto;
    }
    public SendPhoto Avatr11Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/feyQk6GFzkFU4u0IB9KKaVHgHdsOrUdbRLCeRFv7.webp"));
        sendPhoto.setCaption("""
                🚙Avatr 11
                
                ✅Емкость батареи, кВт: 116,79
                ✅Разгон 0-100 км, сек: 4,5
                ✅Мощность: 425кВт / 578 Нм        
                ✅Привод: Полный         
                ✅Запас хода, км: 680
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 200
                
                Стиль Avatr 11 разрабатывался в собственной дизайн-студии компании, расположенной в Мюнхене (Германия) — оттого вид у него скорее европейский, чем азиатский. Внешне автомобиль привлекает внимание футуристичным обликом со стремительным силуэтом. Двери имеют безрамочные стекла и спрятанные в кузов дверные ручки, которые выезжают в момент, когда водитель подходит к машине. В крышку багажника встроен выдвижной активный спойлер.
                """);

        return sendPhoto;
    }
    public SendPhoto HiPhiXRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/mFaMd0SDGOiNIRMzXrbHKdyKlkoXN5zRqAVK1Obv.webp"));
        sendPhoto.setCaption("""
                🚙HiPhi X
                
                ✅Емкость батареи, кВт: 94,3
                ✅Разгон 0-100 км, сек: 4
                ✅Мощность: 440кВт / 598Нм
                ✅Привод: Полный
                ✅Запас хода, км: 550
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 200
                
                Внешность HiPhi X яркая, с футуристичными нотками и нестандартными решениями. Электрический кроссовер получил узкие фары, соединенные между собой светодиодной полосой, бампер с широким воздухозаборником, фактурный капот, безрамные стекла, эффэектные задние фонари и широкие колесные арки. Однако ключевым элементом дизайна являются двери, которые представляют собой комбинацию в стиле Rollse-Royce и «крыла чайки» Mercedes 300 SL. Завершают стильный образ премиального авто оригинальные колесные диски, спойлер на крыше и хромированные акценты на кузове.
                """);

        return sendPhoto;
    }
    public SendPhoto LIAutoOneRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/Rio4OVECZKtP6rATA0xAmwk66swm7pt9i5JmEPLU.webp"));
        sendPhoto.setCaption("""
                🚙LI Auto One
                
                ✅Емкость батареи, кВт: 40.5
                ✅Разгон 0-100 км, сек: 6.5
                ✅Мощность: 244кВт /552Нм        
                ✅Привод: Полный         
                ✅Запас хода, км: 890
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 172
                
                С момента основания самой компании не прошло еще и десяти лет. В 2015 году китайский медиамагнат Сянь Ли, создатель сайта Autohome, основал компанию CHJ Automotive (Chehejia переводится как «автомобиль и дом»). Причем изначально планировалось заняться производством крошечных электромобилей SEV (Small Electric Vehicle) для сдачи в аренду и каршеринга в Европе. Но этот проект быстро свернули и сосредоточились на больших кроссоверах. Причем не чисто электрических, а гибридных — господин Сянь Ли также является одним из основателей компании NextEV, которая занимается выпуском автомобилей Nio.Новый автомобильный бренд получил название Lixiang, по фамилии и имени основателя. Также LI дали англоязычную расшифровку — Leading Ideal («лидирующее совершенство»).
                """);

        return sendPhoto;
    }
    public SendPhoto LynkCo09EMPRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/tS5di4emmprxFcaSAEvu7KeqU8nV2cJpt0WbHTB5.webp"));
        sendPhoto.setCaption("""
                🚙Lynk&Co 09EM-P
                
                ✅Емкость батареи, кВт: 40
                ✅Количество мест: 5
                ✅Привод: Полный        
                ✅Разгон 0-100 км, сек: 5.9         
                ✅Мощность, кВт/л.с: 540
              
                Большой паркетник с индексом 09 в гамме Lynk & Co, совместной марки Geely и Volvo, появился в прошлом году. Флагманская модель длиной 5042 мм построена на вольвовской платформе SPA (Scalable Product Architecture), на которой также базируются актуальные «шведы» шестидесятой и девяностой серий, включая и кроссовер XC90. Lynk & Co 09 бывает только в виде гибрида с бензиновой «турбочетверкой» 2.0 серии Drive-E (254 л.с., 350 Нм), причем таких версий две: у «мягкогибридного» исполнения 09 MHEV турбомотор дополнен 48-вольтовым стартер-генератором, а у подзаряжаемого варианта 09 PHEV на задней оси установлен отдельный электродвигатель мощностью 177 л.с. И вот марка Lynk & Co анонсировала новую топ-версию «девятки».
                """);

        return sendPhoto;
    }
    public SendPhoto ChevroletSeekerRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/sh3Tmy6GCsarJzred5lUMaLxgNM6sECxsApeFUX9.webp"));
        sendPhoto.setCaption("""
                🚙Chevrolet Seeker
                
                ✅Объем: 1.5
                ✅Расход: 6.6
                ✅Мощность, кВт/л.с: 184/135        
                ✅Привод: Передний         
                ✅Коробка: Вариатор
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 205
                
                В конце июля двадцать второго компания Chevrolet представила в Китае новый кроссовер Seeker, который был разработан при непосредственном участии локального СП SAIC-GM.
                                                                                                                                                                                                                        
                По сути перед нами «старший брат» модели Trailblazer, который снаружи примечателен двухэтажной оптикой с узкими полосками ДХО и декоративной перемычкой на безрамочной решетке радиатора. Автомобиль также имеет броские черные накладки по периметру кузова и поставлен на стильные 18-дюймовые диски.
                """);

        return sendPhoto;
    }
    public SendPhoto BYDSongLRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/qrSJ9LUiyqxQm3akh3668mKbbe3Z094IG7pZx8hp.webp"));
        sendPhoto.setCaption("""
                🚙BYD Song L
                
                ✅Емкость батареи, кВт: 87
                ✅Разгон 0-100 км, сек: 4,3
                ✅Мощность: 380кВт / 517 Нм        
                ✅Привод: Полный         
                ✅Запас хода, км: 602
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 200
                
                Спереди BYD Song L расположены узкие фары, между которыми находится фальшивая решетка радиатора. Ниже установлены воздухозаборники и дневные ходовые огни. Сзади находятся широкие фонари, объединенные в один блок. Также есть активное антикрыло и массивный диффузор. Стильные линии кузова, изящно выделенные хромированные элементы и эргономичные формы делают этот автомобиль привлекательным визуальным объектом.
                """);

        return sendPhoto;
    }
    public SendPhoto BYDYangwangU8Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/WGKjCPUUUdL9MdB4AAiLMM0AXSU5TfGwTJ6bZa5F.webp"));
        sendPhoto.setCaption("""
                🚙BYD Yangwang U8
                
                ✅Емкость батареи, кВт: 49.05
                ✅Разгон 0-100 км, сек: 3.6
                ✅Мощность: 880кВт / 1280Нм        
                ✅Привод: Полный         
                ✅Запас хода, км: 405
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 280
                
                Yangwang U8 построен на оригинальной рамной платформе Yisifang, которая отличается очень продвинутой начинкой. Силовая установка состоит из четырех электродвигателей, их суммарная мощность может достигать 1100 лошадиных сил. U8 разгоняется до первой сотни за 3,6 секунды.Yangwang имеет длину 5300 мм и колесную базу 3050 мм. Также у него есть скрытые дверные ручки и 20-дюймовые колеса с шинами размером 275/60 ​​R20.
                """);

        return sendPhoto;
    }


                                        //Хетчбек

    public SendPhoto BYDSeagullRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/XZBuWOU3s2lQzubkw5PZvNlQ9hR64GhnZk1EUprF.webp"));

        sendPhoto.setCaption("""
                🚗BYD Seagull
                
                ✅Емкость батареи, кВт: 38,88
                ✅Разгон 0-100 км, сек: 9,5
                ✅Мощность, кВт/л.с: 55/75      
                ✅Привод: Передний  
                ✅Запас хода (NEDC), км: 405
                ✅Количество мест: 4
                ✅Максимальная скорость, км/ч: 130
                
                Новый BYD Seagull - компактный хэтчбек В-класса с нестандартным дизайном. У него выраженный "нос", рельефные боковины и высокая изогнутая оконная линия. Узкое заднее стекло прикрыто спойлером. Это самая маленькая модель китайской марки.
                """);
        return sendPhoto;
    }

    public SendPhoto BYDDolphinRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/sK0hrrHnCtspCoUUmPlwubE3LzhselJYdTiYv4wu.webp"));

        sendPhoto.setCaption("""
                🚗BYD Dolphin
                
                ✅Емкость батареи, кВт: 44.9
                ✅Разгон 0-100 км, сек: 7,5
                ✅Мощность, кВт/л.с: 130/177      
                ✅Привод: Передний  
                ✅Запас хода (NEDC), км: 401
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 160
                ✅Скорость зарядки (медленная/быстрая), час: 6,41/0,5
                
                Электромобиль BYD Dolphin – это идеальный пример сочетания цены и качества! Функциональный и стильный хэтчбек BYD Dolphin заявил о себе не только на китайском, но и на международном уровне. BYD Dolphin откровенно привлекает внешним видом. Авто имеет стремительный современный и продуманный до мельчайших деталей дизайн. Внешний вид хэтчбека – футуристический, но при этом сдержанный. Лаконические линии силуэта авто подчеркивают мощность, уверенность и оригинальность, а его фантастические формы напоминают, что будущее уже стало реальностью.
                """);
        return sendPhoto;
    }
    public SendPhoto BYDE2Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/wTDQ0xMwIBQvDR2sba11CvPrgEVcaidi66kZuNYq.webp"));

        sendPhoto.setCaption("""
                🚗BYD E2
                
                ✅Емкость батареи, кВт: 43,2
                ✅Разгон 0-100 км, сек: 10,3
                ✅Мощность, кВт/л.с: 70/95      
                ✅Привод: Передний  
                ✅Запас хода (NEDC), км: 405
                ✅Количество мест: 5
                ✅Максимальная скорость, км/ч: 130
                ✅Скорость зарядки (медленная/быстрая), час: 13,1/0,5
                
                Этот экологичный автомобиль является электрическим переднеприводным хэтчбеком. Первый электрокар этого модельного ряда был выпущен совсем недавно: в апреле 2019 года. Byd E2 – стильный 5-дверный хэтчбек, он гармонично дополнил линейку моделей китайского бренда. Дизайн экстерьера выполнен в стиле китайских традиций - передняя часть авто напоминает прищурившегося дракона. Узкие светодиодные фары подчеркивают этот стиль. На корме автомобиля есть светодиодная полоса, соединяющая задние фары.
                """);
        return sendPhoto;
    }
    public SendPhoto ChanganBenBenEStarRus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile("https://ctrans.uz/storage/cars/dBUAaOFl9cQbMGsGart96nB5723xCec8KApGXTmz.webp"));

        sendPhoto.setCaption("""
                🚗Changan BenBen E-Star
                
                ✅Тип топлива: Электрический
                ✅Габариты: 3770*1650*1570
                ✅Максимальная мощность (л.с.): 75      
                ✅Максимальная скорость (км / ч): 101  
                ✅Диапазон NEDC (км): 310
                ✅Количество дверей: 5
                ✅Общая мощность аккумулятора кВт: 31,95
                ✅Мощность двигателя (Квт): 55
                ✅Крутящий момент: 170
                ✅Размер колес: 175/60 ​​R15
                
                
                """);
        return sendPhoto;
    }


    //Miniven





    public SendPhoto DenzaD9Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(""));

        sendPhoto.setCaption("""
                🚐Denza D9
                
                ✅Емкость батареи, кВт: 103,36
                ✅Разгон 0-100 км, сек: 6,9
                ✅Мощность, кВт/л.с: 275/374
                ✅Привод: Полный
                ✅Запас хода (NEDC), км: 600
                ✅Количество мест: 7
                ✅Максимальная скорость, км/ч: 190
                
                Denza D9 – полноразмерный минивэн представительского класса. Всего за полчаса новинка со стартовым ценником в 50 000 долларов собрала 3000 заказов. Минивэн Denza D9 – вторая модель одноименного бренда, созданного BYD Auto и Mercedes-Benz в 2010 году. Презентация новинки состоялась в Китае и была столь успешной, что Габаритная длина модели – 5250 мм, ширина – 1960 мм, высота – 1920 мм, размер между осями – 3110 мм.
                """);
        return sendPhoto;
    }
    public SendPhoto Zeekr009Rus(Long chatId){
        SendPhoto sendPhoto = new SendPhoto();
        sendPhoto.setChatId(chatId);
        sendPhoto.setPhoto(new InputFile(""));

        sendPhoto.setCaption("""
                🚐Zeekr009
                
                ✅Емкость батареи, кВт: 822
                ✅Разгон 0-100 км, сек: 140
                ✅Мощность, кВт/л.с: 400/544
                ✅Привод: Полный 
                ✅Запас хода (NEDC), км: 4,5
                ✅Количество мест: 6
                ✅Максимальная скорость, км/ч: 190
               
                Минивэн Zeekr 009 - это идеальный выбор для тех, кто ценит комфорт, безопасность и экологичность. Большой запас хода, быстрая зарядка и передовые технологии обеспечивают удобство и надежность в использовании.
                """);
        return sendPhoto;
    }








}

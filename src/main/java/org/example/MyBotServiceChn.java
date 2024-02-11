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


public class MyBotServiceChn {
    public SendMessage asosiyMenuChn(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("主選單");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rowList = new ArrayList<>();
        KeyboardRow row = new KeyboardRow();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardRow row2 = new KeyboardRow();
        KeyboardRow row3 = new KeyboardRow();
        KeyboardRow row4 = new KeyboardRow();
        KeyboardRow row5 = new KeyboardRow();
        KeyboardRow row6 = new KeyboardRow();
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83D\uDECD下訂單");
        row.add(button);
        rowList.add(row);
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("\uD83D\uDCDD手動的");
        row1.add(button1);
        rowList.add(row1);
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83D\uDCB5匯率");
        row1.add(button2);
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83D\uDD10為什麼我們這裡安全？");
        row2.add(button3);
        rowList.add(row2);
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83D\uDCC8CTRANS案例回顧");
        row2.add(button4);
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("⏰交貨時間");
        row3.add(button5);
        rowList.add(row3);
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83D\uDC68\u200D\uD83D\uDCBB聯繫經理");
        row3.add(button6);
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83D\uDCCB服务");
        row4.add(button7);
        rowList.add(row4);
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("\uD83D\uDCAC發表評論");
        row4.add(button8);
        KeyboardButton button9 = new KeyboardButton();
        button9.setText("\uD83E\uDDEE計算機");
        row5.add(button9);
        rowList.add(row5);
        KeyboardButton button10 = new KeyboardButton();
        button10.setText("⚙\uFE0F設定");
        row6.add(button10);
        rowList.add(row6);
        reply.setKeyboard(rowList);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage kontaktYuborishChn(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("\uD83D\uDCDE傳送電話號碼.");
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();

        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setRequestContact(true);
        button1.setText("☎\uFE0F傳送電話號碼\n" +
                " \n" +
                "發送號碼為 +86*********。");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

    public SendMessage izohQoldirishChn(Long chatId) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText("發表評論。 您的意見對我們很重要");
        sendMessage.setChatId(chatId);
        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        List<KeyboardRow> rows = new ArrayList<>();
        KeyboardRow row1 = new KeyboardRow();
        KeyboardButton button1 = new KeyboardButton();
        button1.setText("⬅\uFE0F後退");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }
    public SendMessage izohQabulQilindiChn(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("✅您的評論已被接受");
        return sendMessage;
    }

    public SendMessage xitoydanMasshinalarChn(Long chatId){
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);

        ReplyKeyboardMarkup reply = new ReplyKeyboardMarkup();
        KeyboardButton button1 = new KeyboardButton();
        KeyboardRow row1 = new KeyboardRow();
        List<KeyboardRow> rows = new ArrayList<>();
        button1.setText("\uD83D\uDE98來自中國的汽車");
        row1.add(button1);
        rows.add(row1);
        reply.setKeyboard(rows);
        reply.setResizeKeyboard(true);
        sendMessage.setReplyMarkup(reply);
        return sendMessage;
    }

        public SendMessage ctransIshiniKoribChiqish(Long chatId){
    
            String linkCtransWeb = "點擊這個連結:  <a href=\"https://ctrans.uz/en\">CTRANS 網站</a>";
            String linkCtransTg = "點擊這個連結: <a href=\"https://t.me/ctransuz\">CTRANS 我們的電報頻道</a>";
    
            SendMessage sendMessage = new SendMessage();
            sendMessage.setChatId(chatId);
            sendMessage.setText("📌我們的社群網絡.\n" +
                    " \n"
                    + linkCtransWeb + " \n" +
                    linkCtransTg );
            sendMessage.enableHtml(true);
            
            return sendMessage;
        }
}

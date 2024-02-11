package org.example;
/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/11/2024 *Time:12:23 PM
 */

import java.util.ArrayList;

public class DB {



    static ArrayList<User> users = new ArrayList<>(); //[name, curr_pos, curr_language]

    static int IdFinder(String targetName) {
        int l = 0, r = users.size() - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int comparisonResult = users.get(mid).getFirstName().compareToIgnoreCase(targetName);

            if (comparisonResult == 0) {
                return mid;
            } else if (comparisonResult < 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    static void addUser(String name, String curr_lan, String curr_pos, String phoneNumber) {
        User newUser = new User(name, curr_lan, curr_pos, phoneNumber);
        int index = 0;
        int l = 0, r = users.size() - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            int comparisonResult = users.get(mid).getFirstName().compareToIgnoreCase(name);

            if (comparisonResult < 0) {
                l = mid + 1;
                index = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        users.add(index, newUser);
    }
    static void getUser(){
        for(User user : users){
            System.out.println(user);
        }
    }

}

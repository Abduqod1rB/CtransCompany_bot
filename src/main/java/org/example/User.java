package org.example;

import lombok.*;

/*
 *User:t.me/abu_org tt:@abu_ed1t
 *Date:2/11/2024 *Time:12:06 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class User {
    private String firstName;
    private String phoneNumber;
    private String currentPosition;
    private String currentLanguage;

    @Override
    public String toString() {
        return firstName + " " + phoneNumber + " " + currentLanguage + " " + currentPosition;
    }
}

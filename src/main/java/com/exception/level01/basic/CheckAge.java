package com.exception.level01.basic;

import com.exception.level01.basic.exception.InvalidAgeException;

import java.time.LocalDate;

public class CheckAge {

    public void checkTwenty(String inputBirthDay) throws InvalidAgeException {
        /* 만 20세 미만 입장 불가*/
        LocalDate twentyBirthday = LocalDate.parse(inputBirthDay).plusYears(20);
        LocalDate today = LocalDate.now();
        if(twentyBirthday.isAfter(today)) {
            throw new InvalidAgeException("만 20세 미만은 입장 불가입니다.");
        }
    }
}

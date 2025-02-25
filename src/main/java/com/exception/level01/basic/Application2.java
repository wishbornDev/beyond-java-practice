package com.exception.level01.basic;

import com.exception.level01.basic.exception.InvalidAgeException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;

public class Application2 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2014-05-05
         *
         * ----- 출력 예시 -----
         *
         * 만 20세 미만은 입장 불가입니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 1994-05-05
         *
         * ----- 출력 예시 -----
         *
         * 입장하셔도 됩니다.
         *
         * ----- 입력 예시 -----
         *
         * 생년월일 입력 (yyyy-MM-dd 양식으로 작성) : 2000-14-15
         *
         * ----- 출력 예시 -----
         *
         * 날짜 양식을 잘못 입력하셨습니다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CheckAge checkAge = new CheckAge();
        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        try {
            String birthDay = br.readLine();
            checkAge.checkTwenty(birthDay);
            System.out.println("입장하셔도 됩니다.");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (DateTimeException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

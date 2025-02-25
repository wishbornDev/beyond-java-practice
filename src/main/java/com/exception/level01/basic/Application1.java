package com.exception.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 2
         *
         * ----- 출력 예시 -----
         *
         * 결과 : 5
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 십
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 유효한 정수를 입력하세요.
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 0
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 0으로 나누는 것은 허용되지 않습니다.
         * 실행이 완료되었습니다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("분자 입력 : ");
            int numer = Integer.parseInt(br.readLine());
            System.out.print("분모 입력 : ");
            int denomi = Integer.parseInt(br.readLine());

            int div = numer / denomi;

            System.out.println("결과 : " + div);

        } catch (NumberFormatException e) {
            System.out.println("오류 : 유효한 정수를 입력하세요.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는 것은 허용되지 않습니다.");
        } catch (IOException e) {
            System.out.print(e.getMessage());
        } finally {
          System.out.print("실행이 완료되었습니다.");
        }

    }

}

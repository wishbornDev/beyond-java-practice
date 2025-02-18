package com.greedy.level01.basic;

public class Application {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        cal.checkMethod(); // 메소드 호출 확인

        int sum1to10 = cal.sum1to10(); //  1 to 10 합
        System.out.println("1부터 10까지의 합 : " + sum1to10);

        int a = 10;
        int b = 20;
        int c = 5;

        cal.checkMaxNumber(a, b); // 최대값

        int sum = cal.sumTwoNumber(a, b); // 합
        System.out.println("10과 20의 합은 : " + sum);
        int minus = cal.minusTwoNumber(a, c); // 차
        System.out.println("10과 5의 차는 : " + minus);

    }
}

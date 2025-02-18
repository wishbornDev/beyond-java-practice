package com.greedy.level01.basic;

public class Calculator {

    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        int i = 1;
        int sum = 0;
        while(i <= 10) {
            sum += i;
            i++;
        }
        return sum;
    }

    public void checkMaxNumber(int a, int b){
        System.out.println("두 수 중 큰 수는 " + Math.max(a, b) + "이다.");
    }

    public int sumTwoNumber(int a, int b) {
        return a + b;
    }

    public int minusTwoNumber(int a, int b) {
        return a - b;
    }
}

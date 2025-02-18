package com.greedy.level02.normal;

public class Application {
    public static void main(String[] args) {
        int randomNum = RandomMaker.randomNumber(1, 50); // 난수 출력
        System.out.println(randomNum);

        String randomStr = RandomMaker.randomUpperAlpabet(5); // 랜덤 문자열
        System.out.println(randomStr);

        String randomHand = RandomMaker.rockPaperScissors();
        System.out.println(randomHand);

        String randomCoin = RandomMaker.tossCoin();
        System.out.println(randomCoin);


    }
}

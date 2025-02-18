package com.greedy.level02.normal;

import java.util.Random;

public class RandomMaker {

    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) + min;
    }

    public static String randomUpperAlpabet(int length) {
        Random random = new Random();
        String str = "";
        for(int i = 0 ; i < length; i++){
            char ch = (char)(random.nextInt(26) + 65);
            str += ch;
        }

        return str;
    }

    public static String rockPaperScissors() {
        String[] arr = {"가위", "바위", "보"};
        double random = Math.random();
        int index = (int)Math.round(random * (arr.length-1));
        return arr[index];
    }

    public static String tossCoin() {
        String[] arr = {"앞면", "뒷면"};
        double random = Math.random();
        int index = (int)Math.round(random * (arr.length-1));
        return arr[index];
    }
}

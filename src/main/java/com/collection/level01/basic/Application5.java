package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> tset = new TreeSet<>();

        while(true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String input = br.readLine();
            if(input.equals("exit")) break;
            tset.add(input);
        }

        System.out.println("정렬 된 단어 : " + tset);
  }
}

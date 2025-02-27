package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Application2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Queue<String> urls = new LinkedList<>();
        Deque<String> urls2 = new LinkedList<>();

        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String input = br.readLine();
            if (input.equals("exit")) break;
            if(urls2.size() == 5) {
                //urls.poll();
                urls2.pollLast();
            }
            //urls.offer(input);
            urls2.addFirst(input);
            //System.out.println(urls);
            System.out.println(urls2);
        }
    }
}

package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Application3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<String> waiting = new LinkedList<>();

        while(true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");

            String customer = br.readLine();

            if(customer.equals("next")) {
                if (waiting.isEmpty()) {
                    System.out.println("대기 고객이 없습니다.");
                    continue;
                }
                System.out.println( waiting.peek() + " 고객님 차례입니다.");
                waiting.poll();
                continue;
            }

            if(customer.equals("exit")) break;

            waiting.offer(customer);
            System.out.println( customer + " 고객님 대기 등록 되었습니다.");
        }
    }

}

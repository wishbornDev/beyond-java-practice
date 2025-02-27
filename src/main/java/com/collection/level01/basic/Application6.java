package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Application6 {
    static Map<String, String > info = new HashMap<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;

        while(true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String input = br.readLine();
            if (input.equals("search")) {
                System.out.print("검색 할 이름 : ");
                String searchName = br.readLine();
                searchNumber(searchName);
                continue;
            }
            if (input.equals("exit")) break;

            if(!input.contains(" ")){
                System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
            } else {
                st = new StringTokenizer(input);
                info.put(st.nextToken(), st.nextToken());
                System.out.println("추가 완료 : " + input);
            }
        }
    }

    private static void searchNumber(String name) {

         if (!info.containsKey(name)) {
            System.out.println(name + "씨의 번호는 등록 되어 있지 않습니다.");
         } else {
             System.out.println(name + "씨의 전화번호 : " + info.get(name));
         }
    }

}

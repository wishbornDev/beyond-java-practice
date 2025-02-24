package com.api.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Application2 {
    /* ----- 입력 예시 -----
     *
     * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
     *
     * ----- 출력 예시 -----
     *
     * ===== 단어 빈도 =====
     * hello: 2
     * world: 1
     * everyone: 1
     * 가장 빈도 높은 단어 : hello (2 번)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자열 입력 : ");
        String str = br.readLine().toLowerCase();
        String[] arr = str.split("[^a-zA-Z]");

        Map<String, Integer> map = new LinkedHashMap<>();
        int index = 0;
        String maxKey = "";
        for(int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i], Collections.frequency(Arrays.asList(arr), arr[i]));
            }
            maxKey  = maxKey == "" ? arr[i] : map.get(maxKey) > map.get(arr[i]) ? maxKey : arr[i];
        }
        System.out.println("===== 단어 빈도 =====");
        for(String key : map.keySet()) {
            System.out.println(key +": " + map.get(key));
        }

        System.out.println("가장 빈도 높은 단어 : " + maxKey + " (" + map.get(maxKey) + "번)");
    }


}

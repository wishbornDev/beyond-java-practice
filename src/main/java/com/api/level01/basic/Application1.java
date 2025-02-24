package com.api.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Application1 {
    /* ----- 입력 예시 -----
     *
     * 문자열 입력 : I will be a good developer.
     *
     * ----- 출력 예시 -----
     *
     * 변환된 문자열: I Will Be A Good Developer.
     * 총 단어 개수: 6
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("문자열 입력 : " );
        String str = br.readLine();
        String[] arr = str.split(" ");

        for(int i = 0; i<arr.length; i++) {
            String head = arr[i].substring(0,1).toUpperCase();
            String tail = arr[i].substring(1);
            arr[i] = head + tail;
        }
        System.out.print("변환된 문자열: " );
        for(String s : arr) {
            System.out.print(s + "\s");
        }
        System.out.println();
        System.out.println("총 단어 개수: " + arr.length);
    }
}

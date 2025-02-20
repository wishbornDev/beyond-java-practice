package com.array.level04.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Application1 {
    public static void main(String[] args) {

        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
         * */
        Random random = new Random();

        int[] lotto = new int[6];
        ArrayList<Integer> list  = new ArrayList<>();
        for(int i : lotto) {
            list.add(i);
        }

        int index = 0;

        while(index < 6){
           int num = random.nextInt(45) + 1;
           if (!list.contains(num)) {
               list.add(num);
               lotto[index] = num;
               index++;
           }
        }

        Arrays.sort(lotto);
        System.out.println(Arrays.toString(lotto));
    }
}

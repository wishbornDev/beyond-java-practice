package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Application1{
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char isContinued = 'y';
        ArrayList<Double> scores = new ArrayList<>();
        while(isContinued == 'y' || isContinued == 'Y') {
            System.out.print("학생 성적 : ");
            scores.add(Double.valueOf(br.readLine()));
            System.out.print("추가 입력하려면 y : ");
            isContinued = br.readLine().charAt(0);
        }

        double sum = 0;
        for(double score : scores) {
            sum += score;
        }

        System.out.println("학생 인원 : " + scores.size());
        System.out.println("평균 점수 : " + sum / scores.size());
    }
}

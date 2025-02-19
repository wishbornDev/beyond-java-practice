package com.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게를 입력해주세요 : ");
        double weight = sc.nextDouble();
        System.out.print("키(m)를 입력해주세요 : ");
        double height = sc.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        String grade = "";

        if(bmi >= 30) grade = "비만";
        else if (bmi >= 25 && bmi < 30) grade = "과체중";
        else if (bmi >= 20 && bmi < 25) grade = "정상체중";
        else grade = "저체중";

        System.out.println("당신은 " + grade + " 입니다.");

    }
}

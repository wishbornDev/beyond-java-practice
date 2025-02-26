package com.generic.level01.basic;

public class Application2 {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Integer 합계 : " + sum(intArray));

        Double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Double 합계 : " + sum(doubleArray));
        System.out.println("Double 합계 : " + 15.0);
        String[] strArray = {"A", "B", "C"};
//         System.out.println("String 합계 : " + sum(strArray));  // 컴파일 에러 발생
    }

    private static<T extends Number> Number sum(T[] arr) {

        double sum = 0.0;
        for(T n : arr) {
            sum += n.doubleValue();
        }
        return sum;
    }

}

package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Application4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> idset = new HashSet<>();

        while (true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String id = br.readLine();
            if(id.equals("exit")) break;
            if(idset.contains(id)) {
                System.out.println("이미 등록 된 ID입니다.");
                continue;
            }
            idset.add(id);
            System.out.println("ID가 추가 되었습니다.");
        }

        System.out.println("모든 학생의 ID : " + idset);
    }
}

package com.greedy.level01.basic.student.run;

import com.greedy.level01.basic.student.model.dto.StudentDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) {
        // 최대 10명의 정보를 담을 객체 배열 할당
        StudentDTO[] students = new StudentDTO[10];
        try {
            students = getStudentInformation(students);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(StudentDTO st : students) {
            if (st != null) {
                StudentDTO studentDTO = new StudentDTO(st.getGrade(), st.getClassroom(), st.getName(), st.getKor(), st.getEng(), st.getMath());
                int avg = getAverage(st.getKor(), st.getEng(), st.getMath());
                System.out.println(studentDTO.getInformation() + avg);
            }
            else {
                break;
            }
        }

    }

    /*
    *  학생 당 성적 평균
    */
    private static int getAverage(int ... subject) {

        int sum = 0;
        for(int i : subject) {
            sum += i;
        }
        return sum / subject.length ;
    }

    /*
     *  학생 정보 추가
     */
    private static StudentDTO[] getStudentInformation(StudentDTO[] students) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0; // 학생 수
        char add = 'y';

        while(add == 'y') {
            StudentDTO student = new StudentDTO();
            System.out.print("학년 : ");
            student.setGrade(Integer.parseInt(br.readLine()));
            System.out.print("반 : ");
            student.setClassroom(Integer.parseInt(br.readLine()));
            System.out.print("이름 : ");
            student.setName(br.readLine());
            System.out.print("국어 : ");
            student.setKor(Integer.parseInt(br.readLine()));
            System.out.print("영어 : ");
            student.setEng(Integer.parseInt(br.readLine()));
            System.out.print("수학 : ");
            student.setMath(Integer.parseInt(br.readLine()));
            System.out.print("계속 추가할 겁니까? (y/n) : ");
            add = br.readLine().charAt(0);

            students[count] = student;
            count++;
        }
        return students;
    }

}

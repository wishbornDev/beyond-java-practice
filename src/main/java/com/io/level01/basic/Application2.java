package com.io.level01.basic;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Application2 {
    /* ----- 입력 예시 -----
     *
     * (원본 파일이 존재 하는 경우)
     * 원본 파일의 이름을 입력하세요 : origin.txt
     * 복사 파일의 이름을 입력하세요 : copy.txt
     *
     * ----- 출력 예시 -----
     *
     * 파일 복사가 성공적으로 완료 되었습니다.
     *
     * ----- 입력 예시 -----
     *
     * (원본 파일이 존재하지 않는 경우)
     * 원본 파일의 이름을 입력하세요 : origin2.txt
     * 복사 파일의 이름을 입력하세요 : copy2.txt
     *
     * ----- 출력 예시 -----
     *
     * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
     *
     */
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String origin = null;
        String copy = null;
        try {
            System.out.print("원본 파일의 이름을 입력하세요 : ");
            origin = br.readLine();
            System.out.print("복사 파일의 이름을 입력하세요 : ");
            copy = br.readLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fr = new FileReader(origin)) {

            File file = new File(origin);
            File copyFile = new File(copy);

            Files.copy(file.toPath(), copyFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");

        } catch (FileNotFoundException e) {
            System.out.println("오류 : " + origin + " (지정된 파일을 찾을 수 없습니다)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

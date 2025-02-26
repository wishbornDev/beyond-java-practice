package com.io.level02.normal;

import java.io.*;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fileNames = new ArrayList<>();
        String fileName = null;
        String mergeName = null;
        try {
            System.out.print("병합할 파일의 개수 입력 : ");

            int fileNum = Integer.parseInt(br.readLine());

            for (int i = 1; i <= fileNum; i++) {
                System.out.print(i + "번째 파일 이름 입력 : ");
                fileName = br.readLine();
                FileInputStream fis = new FileInputStream(fileName);
                fileNames.add(fileName);
            }
            System.out.print("병합 될 파일 명 입력 : ");
            mergeName = br.readLine();
            fileMerge(fileNames, mergeName);
            System.out.println("파일 병합이 완료되었습니다.");
        } catch (FileNotFoundException e) {
                System.out.println("오류 : " + fileName + " (지정된 파일을 찾을 수 없습니다)");
        } catch (IOException e) {
            e.getMessage();
        }
    }
    private static void fileMerge(ArrayList<String> fileNames, String mergeName) throws IOException {

        File merge = new File(mergeName);
        FileOutputStream fos = null;
        fos = new FileOutputStream(merge);
        for(String name : fileNames) {

            File origin = new File(name);
            FileInputStream fis = new FileInputStream(origin);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int len = 0;
            byte[] barr = new byte[1024];
            while((len = bis.read(barr,0,1024)) != -1) {
                fos.write(barr, 0, len);
            }
        }

    }
}

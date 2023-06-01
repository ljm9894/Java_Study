package kr.hs.dgsw.java.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileCopier {

    private static void copyFile(String sourceFile, String destinationFile) throws IOException {
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream = null;

        try{
            fileInputStream = new FileInputStream(sourceFile);
            fileOutputStream = new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];
            int length;
            while((length = fileInputStream.read(buffer))>0){
                fileOutputStream.write(buffer, 0 , length);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(fileInputStream != null){
                fileInputStream.close();
            }if(fileOutputStream != null){
                fileOutputStream.close();
            }
        }
    }

    public static void main(String[] args) {
        String sourceFile = "C:\\java\\대소고.txt";
        String destinationFile = "C:\\java\\2학년 2반";

        try{
            copyFile(sourceFile, destinationFile);
            System.out.println("파일이 성공적으로 복사되었습니다.");
        }catch (Exception e){
            System.out.println("파일 복사 실패");
            e.printStackTrace();
        }
    }
}

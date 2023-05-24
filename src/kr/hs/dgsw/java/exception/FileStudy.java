package kr.hs.dgsw.java.exception;


import java.io.*;

public class FileStudy {
    public String readFile(String path){
        File file = new File(path);
        FileInputStream is = null;
        try {
//            FileReader fileReader = new FileReader(file);
//            BufferedReader reader = new BufferedReader(fileReader);
            is = new FileInputStream(file);
            byte[] buffer = new byte[1024];
            int length;
            String result = "";
            while ((length = is.read(buffer)) > 0) {
                result += new String(buffer, 0, length);
            }
            is.close();
            return result;
        }catch(FileNotFoundException e){

        }catch(IOException e){

        }catch(Exception e){

        }

        return null;
    }
    public String readFile2(String path) throws IOException{
        File file = new File(path);
        FileInputStream is = null;
        is = new FileInputStream(file);
        byte[] buffer = new byte[1024];
        int length;
        String result = "";
        while ((length = is.read(buffer)) > 0) {
            result += new String(buffer, 0, length);
        }
        is.close();
        return result;
    }

    public static void main(String[] args) {
        FileStudy study = new FileStudy();
        String str = study.readFile("C:\\Users\\b0107\\OneDrive\\바탕 화면\\1학년 면담 내용.txt");
        System.out.println(str);
    }
}

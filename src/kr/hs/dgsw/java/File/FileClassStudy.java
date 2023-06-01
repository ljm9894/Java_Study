package kr.hs.dgsw.java.File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClassStudy {


//    File 클래스 기본

    public void basic(){
        File file1 = new File("C:\\java\\대소고.txt");
        File file2 = new File("C:\\java", "대소고.txt");

        File file3 = new File("C:\\java", "hello.txt");

    }

    public void makeFile(String path, String fileName) {
        File file = new File(path,fileName);
        try{
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }

    }

    public void deleteFile(String path, String fileName){
        File file = new File(path,fileName);

        file.delete();
    }

    public void makeDirectory(String path){
        File dir = new File(path);
        dir.mkdir();
    }
    public void deleteDirectory(String path){
        File dir = new File(path);
        dir.delete();
    }

    public void printFileInformation(File file){
        file.isFile();
        file.isDirectory();

        if(file.isFile()){
            System.out.println("파일");
        }else if(file.isDirectory()){
            System.out.println("디렉토리");
        }else{
            System.out.println("모르겠어요.");
        }
    }
    public void print(String path) throws IOException {
        File file = new File(path);
        String absolutePath =  file.getAbsolutePath();
        String canonicalPath = file.getCanonicalPath();

        String fileName = file.getName();
        System.out.printf("절대경로 : %s %s\n", fileName);

        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.printf("마지막으로 수정된 시각 : %s\n", date.toString());
    }

    public static void main(String[] args) throws IOException {
        FileClassStudy study = new FileClassStudy();
        study.basic();
        study.makeFile("C:\\java", "abcd.txt");
        study.deleteFile("C:\\java", "abcd.txt");
        study.makeDirectory("C:\\java\\2학년2반");

    }


}

package kr.hs.dgsw.java.Scanner;
import java.util.Scanner;
public class ScannerStudy {
    Scanner scanner = null;
    public void preparedScanner(){
        this.scanner = new Scanner(System.in);
    }
    public void cleanupScanner(){
        if(this.scanner != null){
            this.scanner.close();
        }
    }
    public void studyScanner(){
        while(true) {
            String str = this.scanner.next();
            if("quit".equals(str)){
                break;
            }
            System.out.println("읽어온 값 : " + str);
        }
    }
    public void studyScannerInt(){
        int value = this.scanner.nextInt();
        System.out.println(value + 3);
    }

    public static void main(String[] args){
        ScannerStudy study = new ScannerStudy();
        study.preparedScanner();
        //study.studyScanner();
        //study.cleanupScanner();
        study.studyScannerInt();
    }

}

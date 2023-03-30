package kr.hs.dgsw.java.studyclass;

public class Human {
    String name;
    int age = 0;
    double height = 0;
    void info(){
        System.out.println("홍길동님의 나이는"+age+"이고 키는"+height);
    }
    void aged(){
        age++;
        if(age<20) {
            height+=8.4;
        }
    }
}
package kr.hs.dgsw.java.studyclass;

public class School {
    String schoolName;
    int countOfStudents = 0;
    void teach(){
        System.out.println(schoolName + countOfStudents + "명이 공부를 하고 있습니다.");
    }
    void enroll(){
     countOfStudents++;
    }
    void graduate(){
        countOfStudents--;
    }
}


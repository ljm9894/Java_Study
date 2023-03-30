package kr.hs.dgsw.java.studyclass;

public class SchoolJob {
    public static void main(String[] args){
        School dgsw = new School();
        School bssw = new School();

        dgsw.schoolName = "대구소프트웨어마이스터고등학교";
        dgsw.enroll();
        dgsw.enroll();
        dgsw.teach();
        dgsw.graduate();
        dgsw.teach();

        bssw.schoolName = "부산소프트웨어스터고등학교";
        bssw.enroll();
        bssw.teach();
        bssw.graduate();
        bssw.teach();
    }
}

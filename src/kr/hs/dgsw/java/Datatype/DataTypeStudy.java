package kr.hs.dgsw.java.Datatype;

public class DataTypeStudy {
    void studyInteger(){
        byte byteValue = 1;
        byteValue = 127;
        byteValue++;
        System.out.println(byteValue);
        short shortValue = 1;
        System.out.printf("short type의 범위 : %d ~ %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
    }

    public static void main(String[] args) {
        DataTypeStudy study = new DataTypeStudy();
        study.studyInteger();
    }
}

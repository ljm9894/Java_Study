package kr.hs.dgsw.java.variable;

public class VariableStudy {
    final int COUNT_OF_STUDENT = 0;
    void study(){
        int value1 = 5;
        int value2 = 3;

        String $name = "";
        String name$ = "";

        double abc_ddd = 3.2;
        String 한글 = "dd";

        System.out.println(한글);
        int name = 5;
        String age = "홍길동";
    }

    public static void main(String[] args) {
        VariableStudy hello = new VariableStudy();
        hello.study();
    }
}

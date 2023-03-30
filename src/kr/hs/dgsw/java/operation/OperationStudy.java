package kr.hs.dgsw.java.operation;


public class OperationStudy {
    //산술연산자
    void studyArithmetic(){
        int op1 = 5;
        int op2 = 4;
        int plus = op1 + op2;
        int minus = op1 - op2;
        int multiply = op1 * op2;
        int divide = op1/op2;
        int module = op1%op2;

        int fail = 5/1;
        fail = 5%1;
    }
    //비교연산자
    void studyRelation(){
        int op1 =5;
        int op2 = 3;

        boolean result;
        result = op1 == op2;
        result = op1> op2;
        result = op1< op2;
        result = op1 != op2;
        result = op1 >=op2;
        result = op1<=op2;
    }
    // and , or , not 연산자
    void studyLogical(){
        boolean op1 = true;
        boolean op2 = false;
        boolean result;

        result = op1 && op2;
        result = op1 || op2;
        result = !op1;
    }
    //3항연산자
    void studyTernary(){
        boolean condition = true;
        int result = condition ? 5: 4;
    }
    public static void main(String[] args) {
        OperationStudy object = new OperationStudy();
        object.studyArithmetic();
    }
}

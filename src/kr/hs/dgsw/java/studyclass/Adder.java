package kr.hs.dgsw.java.studyclass;

public class Adder {
    int plus(int operand1, int operand2){
        int sum = operand1 + operand2;
        return sum;
    }
    int minus(int operand1, int operand2){
        return operand1 - operand2;
    }
    int gop(int operand1, int operand2){
        return operand1 * operand2;
    }
    public static void main(String[] args){
        Adder calc = new Adder();
        int result = calc.plus(456648, 125348);
        System.out.println(result);
    }
}

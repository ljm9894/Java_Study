package kr.hs.dgsw.java.exception;

import jdk.nashorn.internal.runtime.ECMAException;

public class ExceptionStudy {
    public void method1(){
        String str = null;
        int length = str.length();

        int[] array = new int[5];
        array[7] = 3;
    }

    public int divide(int op1, int op2){
        try{
            int result = op1/op2;
            return result;
        }catch(Exception e){
            System.out.println("location 3");
            return 0;

        }
    }

    public static void main(String[] args) {
        ExceptionStudy study = new ExceptionStudy();
            study.method1();
            study.divide(1,2);
    }
}

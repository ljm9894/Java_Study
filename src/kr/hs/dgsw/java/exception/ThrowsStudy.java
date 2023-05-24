package kr.hs.dgsw.java.exception;

public class ThrowsStudy {
    public void method1() throws Exception{
        System.out.println("method1 called");
        try{
            method2();
        }catch(Exception e){

        }
    }
    public void method2() throws Exception{
        System.out.println("method2 called");
    }

    public void method3() throws Exception{
        System.out.println("method3 called");
    }
    public static void main(String[] args) {
        ThrowsStudy study = new ThrowsStudy();
        //study.method1();
    }
}

package kr.hs.dgsw.java.exception;

public class FinallyStudy {
    public String method1(){
        try{
            System.out.println("point1");
            method2();
            System.out.println("point2");
            return "hello";

        }catch(Exception e){
            System.out.println("point3");
            throw new RuntimeException(e);
        }finally {
            System.out.println("point4");
        }
    }

    private void method2() throws Exception{
        System.out.println("method2");
        throw new Exception();
    }

    public static void main(String[] args) {
        FinallyStudy study = new FinallyStudy();
        study.method1();
    }
}

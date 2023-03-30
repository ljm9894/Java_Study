package kr.hs.dgsw.java.studyclass;

public class Accumulator {


    int sum = 0;
    void add(int value){
        sum+=value;
    }
    int getSum(){
        return sum;
    }
    void reset(){
        sum = 0;
    }
    public static void main(String[] args){
        Accumulator object = new Accumulator();
        object.add(3);
        object.add(3);
        object.add(11);
        int value1 = object.getSum();
        System.out.print(value1);
        object.add(-5);
        object.reset();
        int value2 = object.getSum();
        System.out.println(value2);
    }
}

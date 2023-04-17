package kr.hs.dgsw.java.Array;

import java.util.Random;

public class MyArray {
    int[] array = new int[10];
    void init(){
        Random random = new Random(System.currentTimeMillis());
        for(int i=0;i<array.length;i++) {
            array[i] = random.nextInt(1000);
        }


    }
    //array에서 가장 큰 값을 반환하세요
    int getMax(){
        int maxValue=0;
        for(int value : array){
            if(value>maxValue){
                maxValue = value;

            }
        }
        return maxValue;
    }
    void printArray(){
        for(int i=0;i<array.length;i++){
            System.out.printf("%d", array[i]);
            if(i==array.length-1){
                break;
            }
            System.out.printf(", ");
        }
    }
    int getAllSum() {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
    double average(){
        int sum = getAllSum();
        double av = sum/array.length;
        return av;
    }
    int minIndex(){
        int min=999;
        int index=0;
        for(int i=0;i< array.length;i++){
            if(min>array[i]){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.init();
        //int max = myArray.getMax();
        //System.out.printf("MAX value : %d\n", max);
        myArray.printArray();
        int sum = myArray.getAllSum();
        double av = myArray.average();
        int minIndex = myArray.minIndex();
        System.out.println();
        System.out.println("sum = "+ sum);
        System.out.println("average = "+av);
        System.out.println("minIndex = " + minIndex);
    }
}

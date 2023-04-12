package kr.hs.dgsw.java.Array;


import java.lang.reflect.Array;

public class ArrayStudy {
    void study(){
        double[] doubleArray = new double[100];
        String[] strArray = new String[20];
        boolean[] boolArray = new boolean[100];

        // 값을 읽고 쓰기
        strArray[2] = "Lian";
        strArray[5] = "Rabbit";
        doubleArray[0] = 3.14;

        String str = null;
        str = strArray[5];

        System.out.println(strArray[3]);
        System.out.println(strArray[2]);
    }
    void studyInit() {
        int[] values = new int[] {5,4,9,3,1};

        System.out.println(values[0] + " " + values[1]);

        //배열의 길이를 알기 위해서 length 속성을 사용한다.
        int lengthOfArray = values.length;
        System.out.printf("배열의 길이 : %d\n", lengthOfArray);

        for(int i=0; i<lengthOfArray;i++){
            System.out.println(values[i]);
        }
        for(int value : values){
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        ArrayStudy study = new ArrayStudy();
        study.studyInit();
        //study.study();
    }
}

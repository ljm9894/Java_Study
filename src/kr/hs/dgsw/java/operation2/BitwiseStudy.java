package kr.hs.dgsw.java.operation2;

public class BitwiseStudy {
    //and
    void studyAnd() {
        int op1 = 0b0111;
        int op2 = 0b0011;
        int result = op1 & op2;
        System.out.printf("%d",result);

        op1 = 0x3A;
        op2 = 0x15;
    }
    //or
    void studyOr(){
        int op1 = 0b00101010;
        int op2 = 0b01011101;

        int result = op1 | op2;
        System.out.printf("%d | %d = %d\n", op1, op2, result);
    }
    //xor
    void studyXor(){
        int op1 = 5;
        int op2 = 3;
        int result = op1 ^ op2;
        System.out.printf("%d",result);
    }

    void studySome(){
        double doubleValue = 3.14;
        int intValue= 3;

        String value = "123";
        int value2;

    }
    void studyNot(){
        int value = 0b0000001;
        int not = ~value;
        System.out.printf("~%d = %d\n", value ,not);
    }
    void studyLeftShift(){
        int value = 0b00000010;
        int count = 1;
        int shifted = value<< count;
        System.out.printf("%d << %d = %d\n", value, count, shifted);
    }
    void studyRightShift(){
        int value = 0b00010000;
        int count = 1;
        int shifted =value >> count;
        System.out.printf("%d >> %d = %d\n", value, count, shifted);
    }
    public static void main(String[] args) {
        BitwiseStudy object = new BitwiseStudy();
        //object.studyAnd();
        //object.studyXor();
        //object.studyNot();
        object.studyLeftShift();
    }
}

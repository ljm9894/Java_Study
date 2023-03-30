package kr.hs.dgsw.java.operation3;

public class BinaryConverter {
    String toBinary(int value){
        String numStr = "";
        while(value>0){
            numStr = (value%2) + numStr;
            value/=2;
        }
        return numStr;
    }

    public static void main(String[] args) {
        BinaryConverter binary = new BinaryConverter();
        System.out.printf("%s", binary.toBinary(128));
    }
}

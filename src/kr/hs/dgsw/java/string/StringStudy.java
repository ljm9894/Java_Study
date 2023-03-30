package kr.hs.dgsw.java.string;

public class StringStudy {
    public static void main(String[] args) {
        String schoolName = "대구소프트웨어 마이스터 고등학교";
        String nation = new String("대한민국");
        String flower = "rose";

        String str1 = "대한민국";
        String str2 = "파이팅";
        String str3 = str1 + str2;

        System.out.println(str3);

        String number1 = "32";
        int number2 = 4;
        String number3 = number1 + number2;

        System.out.println(number3);

        int number = 5;
        String str = number + "";
    }
}

package kr.hs.dgsw.java.problem;

import java.util.Scanner;

public class classWork {
    void money() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("오만원권 : " + n / 50000 + "장");
        n %= 50000;
        System.out.println("일만원권 : " + n/10000 + "장");
        n%=10000;
        System.out.println("일천원권 : " + n/1000 + "장");
        n%=1000;
        System.out.println("오백원권 : " +n/500 + "장");
        n%=500;
        System.out.println("일백원권 : " +n/100 + "장");
        n%=100;
        System.out.println("일십원권 : " +n/10 + "장");

    }
    void guGuDan(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for(int i=1;i<=9;i++){
            System.out.println(n +" * "+i+ " = " +n*i);
        }
    }

    void judge(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int[] arr = new int[101];
        int cnt=0;
        int sum=0;
        for(int i = 1; i<n;i++){
            if(n%i==0) {
                arr[cnt++] = i;
            }
        }
        for(int i = 0; i<=cnt; i++){
            sum+=arr[i];
        }
        if(sum==n){
            System.out.println("완전수");
        }else{
            System.out.println("완전수 아님");
        }

    }
    void lcm(){
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt(), b= scanner.nextInt();
        scanner.close();
        int gcd= 0;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println("최소공배수" + (a*b)/gcd);;

    }

    void factorial(){ //팩토리얼 코드
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("factorial : " + fact);
    }

    public static void main(String[] args) {
        classWork Class = new classWork();
        //Class.money();
        //Class.guGuDan();
        //Class.judge();
        //Class.lcm();
        Class.factorial();
    }
}

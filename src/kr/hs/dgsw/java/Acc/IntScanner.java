package kr.hs.dgsw.java.Acc;

import java.util.Scanner;

public class IntScanner {
    Scanner scanner = null;
    public void readyScanner(){
        this.scanner = new Scanner(System.in);
    }
    public void plus(){
        int a = this.scanner.nextInt();
        int b = this.scanner.nextInt();
        int sum = a+b;
        System.out.println("a+b = "+ sum);
    }

    public static void main(String[] args) {
        IntScanner acc = new IntScanner();
        acc.readyScanner();
        acc.plus();
    }
}

package kr.hs.dgsw.java.Array;

import sun.java2d.pipe.SpanShapeRenderer;

import java.util.Scanner;

public class SimpleStack {
    private static final int SIZE = 10;

    private String[] array = new String[SIZE];
    public int top = 0;

    void push(String value) {
        array[top] = value;
        top++;
    }

    String pop() {
        top--;
        return array[top];
    }

    boolean isFull(){
        return top== array.length ?  true : false;
    }
    boolean isEmpty(){
        return top== 0 ? true : false;
    }
    int top(){
        return top;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleStack stack = new SimpleStack();
        String command = null;
        String data = null;
        while(true){
            System.out.printf("Command : ");
            command = sc.next();
            if("push".equals(command)) {

                if (stack.isFull()){
                    System.out.println("Stack Full");
                    continue;
                }
                data = sc.next();
                stack.push(data);
            }else if("pop".equals(command)){
                if(stack.isEmpty()){
                    System.out.println("Stack Empty");
                    continue;
                }
                data = stack.pop();
                System.out.println(data);
            }else if("size".equals(command)) {
                System.out.println(stack.top());
            }
            else if("exit".equals(command)){
                break;
            }else{
                System.out.println("멍충아!");
            }


        }
        sc.close();
    }
}

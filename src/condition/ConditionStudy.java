package condition;

import java.util.Scanner;

public class ConditionStudy {
    void studyIf(){
        boolean flag1 = false;
        boolean flag2 = true;
        if(flag1){

        }else if(flag2){

        }else{

        }
        int value;
        if(flag1)
            value =1;
        if(flag2)
            value = 2;
        else
            value = 3;
        System.out.println(value);

    }
    void studyWhile(){
        Scanner scanner = new Scanner(System.in);
        String str = null;
        while(true){
            str = scanner.next();
            if("Q".equals(str)){
                break;
            }
            System.out.println(str);
        }
        scanner.close();
    }
    void studyFor(){
        int sum = 0;
        for (int i=1;i<=100;i++){
            if(i%2==0)
                sum+=i;
        }
        System.out.println(sum);
        sum=0;
        for(int i = 0;i<100;++i){
            sum+=i;
        }
        System.out.println(sum);
    }
    void studyFor2(){
        String[] colors = new String[] {"red", "yellow", "green", "blue", "black"};
        for(int i=0;i<colors.length;i++){
            System.out.println(colors[i]);
        }
        for(String color : colors){
            System.out.println(color);
        }
    }

    void studySwitch(){
        int value = 5;
        switch(value){
            case 1 :
                System.out.println("짱입니다.");
            case 5 :
                System.out.println("좀 더 노력하세요.");
                break;
            default :
                System.out.println("낙제입니다.");
                break;
        }
    }

    public static void main(String[] args) {
        ConditionStudy condition = new ConditionStudy();
        condition.studyIf();
    }
}

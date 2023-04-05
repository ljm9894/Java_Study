package condition;

import java.util.Scanner;

public class decideGrade {
    String decideGradle(int score){
        switch(score/10){
            case 10 :
            case 9:
                return "good";

            case 8:
            case 7:
                return "soso";
            case 6:
            case 5:
                return "bad";
            default:
                return "veryvery bad";

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        decideGrade decide = new decideGrade();
        int score = scanner.nextInt();
        scanner.close();
        System.out.println(decide.decideGradle(score));
    }
}

package MiscExamples;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x > 0){
            int y = x * 5;
            if(y > 10){
                System.out.printf("x: %d, y: %d", x,y);
            }else{
                System.out.println("Condition not met");
            }
        }else {
            int y = x * 7 + 13;
            if(y % 2 != 0){
                System.out.printf("x: %d, y: %d",x,y);
            }else {
                System.out.println("Condition not met");
            }
        }


//        System.out.println("Value of y: " + y);
    }
}

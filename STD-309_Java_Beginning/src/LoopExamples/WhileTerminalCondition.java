package LoopExamples;

import java.util.Scanner;

public class WhileTerminalCondition {

    public static void main(String[] args) {

        while (true){
            System.out.print("Enter Number: ");
            int number = new Scanner(System.in).nextInt();
            if(number*2+1 == 7){
                System.out.println("Condition met! "+ number);
                break;
            }
            System.out.println("Condition not met!");

        }
    }
}

package ControlStatements;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {

        //To check even or odd numbers
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        if(num % 2 == 0){
            System.out.println("This is an even number");
        }else{
            System.out.println("This is an odd number");
        }

    }
}

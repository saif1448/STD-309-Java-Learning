package LoopExamples;

import java.util.Scanner;

public class SummingTheDigitsOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        String numStr = ""+number;
        System.out.println("Number of Digits: " +numStr.length());

        int sum = 0;

        while (number > 0){
            int lastDigit = number % 10;
            number/=10;
            sum+= lastDigit;
        }

        System.out.println("The sum of digits: " + sum);
    }
}

package LoopExamples;

import java.util.Scanner;

public class DigitExtraction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int i = sc.nextInt();

//        int lastDigit = i % 10;
//        i = i / 10;
//        System.out.println(lastDigit);
//        System.out.println(i);
//
//        lastDigit = i  % 10;
//        i /= 10;
//        System.out.println(lastDigit);
//        System.out.println(i);
//
//        lastDigit = i % 10;
//        i/=10;
//        System.out.println(lastDigit);
//        System.out.println(i);
//
//        lastDigit = i % 10;
//        i /= 10;
//        System.out.println(lastDigit);
//        System.out.println(i);

        while( i > 0){
            int lastDigit = i % 10;
            i/=10;
            System.out.println(lastDigit);
//            System.out.println(i);
        }

    }
}

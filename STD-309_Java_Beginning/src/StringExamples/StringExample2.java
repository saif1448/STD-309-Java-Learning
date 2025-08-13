package StringExamples;

import java.util.Arrays;
import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {
//        System.out.println("I said %s");
//        int mark = 20;
//        System.out.printf("I saif my mark is: %d ", mark);
//        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();


        System.out.println("Enter your age: ");
        int age = Integer.parseInt(sc.nextLine());

//        System.out.printf("My name is %d and my age is %s", name, age);
        // the above line is gonna create error because string does not go with %d

        System.out.printf("My name is %s and my age is %d", name, age);
        System.out.println();

    }
}

package MiscExamples;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        // Ternary Operator takes 3 operand
        // ?: ----> this is shorthand expression for if...else
        // condition ? if true single line of statement what to do : else single line statement
        // it must return some value

        Scanner sc = new Scanner(System.in);
//        int marks = sc.nextInt();
//
////        if(marks >= 80) System.out.println("Grade is A+");
////        else System.out.println("Grade is other");
//
//        String grade = marks >= 80 ? "A+" : "Other";
//
//        System.out.println("Grade is " + grade);

        // Title Example
        System.out.println("Enter Gender: ");
        String gender = sc.nextLine().toLowerCase();
        System.out.println("Enter Age: ");
        int age = Integer.parseInt(sc.nextLine());

//        String title = gender.equals("m") ? age >= 16 ? "Mr." : "Master"  : age >= 16 ? "Mrs." : "Miss";

        String title = gender.equals("m") ?
                age >= 16 ?
                        "Mr."
                        : "Master"
                : age >= 16 ?
                "Mrs."
                : "Miss";

        System.out.println("Thte title is: "+ title);

    }
}

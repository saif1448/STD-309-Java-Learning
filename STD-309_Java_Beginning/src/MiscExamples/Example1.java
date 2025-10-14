package MiscExamples;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        // if you have only a single line of statement to be executed after if / for, then you don't need curly braces, it is not mandatory

//
//        int marks = 74;
//
//        if(marks >= 80) System.out.println("Grade is A+");
//            //Point A
//        else System.out.println("Grade is other");
//            //Point B
//
//
//        //point C
//        System.out.println("This is outside condition");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter gender");
        String gender = sc.nextLine().toLowerCase();
        int age = Integer.parseInt(sc.nextLine());
        String title;

        if(gender.equals("m"))
            if(age >= 16) title = "Mr.";
            else title = "Master";
        else
        if(age >= 16) title = "Mrs.";
        else title = "Miss";

        System.out.println("The title: " + title);


        // if
        // if ... else
        // if ... else if ... else
        // nested if else
        // switch case


    }
}

package ControlStatements;

import java.util.Scanner;

public class ConditionalChainingExample {
    public static void main(String[] args) {
        //This example will replicate the login logic

        Scanner sc = new Scanner(System.in);

        System.out.println("To enter the system provide credentials");

        System.out.println("Enter username: ");
        String username = sc.nextLine();

        System.out.println("Enter password:");
        String password = sc.nextLine();


        if (username.isEmpty() || password.isEmpty()) { // this is indicating conditional chaining with logical operator
            if (username.isEmpty()) {             // this is the example of nested if else
                System.out.println("Username was not provided");
            }

            if (password.isEmpty()) {
                System.out.println("Password was not provided");
            }

        } else {
            System.out.println("Now you may log in");
        }

    }
}

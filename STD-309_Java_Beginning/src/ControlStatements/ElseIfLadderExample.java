package ControlStatements;

import java.util.Scanner;

public class ElseIfLadderExample {

    public static void main(String[] args) {

        // Weight depending discount

        // >=60 kg ---> 5%
        // >=70 kg ---> 10%
        // >=80 kg ---> 15%
        // >=90 kg ---> 25%

        // total_bill ---> adjust the discount with this

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total bill: ");
        double total_bill = Double.parseDouble(sc.nextLine());

        System.out.println("Enter user weight: ");
        double weight = Double.parseDouble(sc.nextLine());



        if(weight >= 90){
            total_bill -= total_bill*0.25;
        } else if (weight >= 80) {
            total_bill -= total_bill*0.15;
        } else if (weight >= 70) {
            total_bill -= total_bill*0.10;
        } else if (weight >= 60) {
            total_bill -= total_bill*0.05;
        }

        System.out.println("Final Bill: " + total_bill);


    }

}

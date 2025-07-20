import java.util.Scanner;

public class InputOutpur3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Session: ");
        String session = sc.nextLine();

        System.out.println("Enter Mark: ");
        double mark = Double.parseDouble(sc.nextLine());

        System.out.println("Enter Grade: ");
        int grade = Integer.parseInt(sc.nextLine());

        System.out.println("Enter Address: ");
        String address = sc.nextLine();


        System.out.println("\n--- Student Information ---");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Session : " + session);
        System.out.println("Mark    : " + mark);
        System.out.println("Grade   : " + grade);
        System.out.println("Address : " + address);



        /\

    }
}

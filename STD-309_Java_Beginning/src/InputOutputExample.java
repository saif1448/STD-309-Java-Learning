import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your address: ");
        String address = sc.nextLine();
        System.out.println("Enter your mobile number: ");
        String mobile_number = sc.nextLine();

        System.out.println("Name: " + name + "\nAddress: " + address + "\nMobile Number: " + mobile_number);


        // We are gonna deal with numeric type

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your mark");
        int mark = sc.nextInt();

        System.out.println("Name: " + name + "\nAge: "+ age + "\nMark: " + mark);

        System.out.println("Enter the distance: ");
        double distance = sc.nextDouble();

        System.out.println("Enter boolean statement: ");
        boolean statement = sc.nextBoolean();


        //Special case
        System.out.println("Enter character: ");
        char c =  sc.next().charAt(0);



    }
}

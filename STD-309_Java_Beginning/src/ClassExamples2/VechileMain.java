package ClassExamples2;

import java.util.Scanner;

public class VechileMain {
    public static void main(String[] args) {

        //Encapsulation ---> Attribute and Method ---> Property
        // Class ---> blue print
        // Object ---> Instance of the class
        // Instance Variable --->
        // Instance Method --->
        // Constructor ----> Default or Null Constructor, Parameterized Constructor
        // Accessors or Getters
        // Mutators or Setters
        // toString()

        Vechile c1 = new Vechile(); // c1 ----> c1.color, c1.model, c1.type, c1.speed

        Vechile c2 = new Vechile(); // c2 ----> c2.color, c2.model, c2.type, c2.speed

//        Scanner sc = new Scanner(System.in);
        Vechile c3 = new Vechile("red", "QASS", "XYZ", 999.0, true);

        c3.setColor("BLUE");

        System.out.println("C3 color " + c3.getColor());
        c1.setSpeed(351);
        System.out.println("C1 Speed Cat: " + c1.getSpeedCategory());
        System.out.println("C3 Speed Cat: " + c3.getSpeedCategory());

    }
}

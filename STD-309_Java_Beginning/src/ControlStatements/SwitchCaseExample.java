package ControlStatements;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        // W --> up
        // S --> down
        // A --> left
        // D --> right

        Scanner sc = new Scanner(System.in);

        System.out.println("Input keyboard arrow (W,A,S,D): ");

        String keyPress = sc.nextLine().toLowerCase();

        //equlas () --> == matching, it is only for string

//        if(keyPress.equals("w")){
//            System.out.println("Up Arrow");
//        }else if(keyPress.equals("s")){
//            System.out.println("Down Arrow");
//        } else if (keyPress.equals("a")) {
//            System.out.println("Left Arrow");
//        } else if (keyPress.equals("d")) {
//            System.out.println("Right arrow");
//        }

        switch (keyPress){
            case "w":
                System.out.println("Up Arrow");
                break;
            case "s":
                System.out.println("Down Arrow");
                break;
            case "a":
                System.out.println("Left Arrow");
                break;
            case "d":
                System.out.println("Right Arrow");
                break;
            default:
                System.out.println("Wrong key pressed");
        }

    }
}

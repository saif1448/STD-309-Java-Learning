package FileIOExample;

import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};


        System.out.println("Enter Index Number: ");
        Scanner sc = new Scanner(System.in);

        int idx = sc.nextInt();

        try {
            System.out.println("index: " +idx + ", Value: " +arr[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }


        System.out.println("The program ended");

    }

}

package ArrayAlgorithmExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ArrayRecap {

    public static void main(String[] args) {
        // we are creating a 5 length array
        int[] arr = new int[5];
//        double[] arr = new double[5];
//        boolean[] arr = new boolean[5];
//        char[] arr = new char[5];
        //String[] arr = new String[5]; // all the values will be null

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] arr2 = {1,2,3,4,5,6};  // size = 5


        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);


        System.out.println(arr2.length);

        // we are traversing over the range of valid indices

        // printing every value of the array
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        //printing every even index value
        for(int i = 0; i < arr2.length; i+=2){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        //printing every odd index value
        for(int i=1; i<arr2.length; i+=2){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        //conditional picking
        int[] arr3 = {3,5,8,12,41,32,79,42,90,76,89,54,102,58,64,31,28};

        // condition : pick only the even numbers
        for(int i = 0; i<arr3.length; i++){
            if(arr3[i] % 2 == 0){
                System.out.print(arr3[i] + " ");
            }
        }

        System.out.println();
        // condition : pick only the odd numbers
        for(int i = 0; i<arr3.length; i++){
            if(arr3[i] % 2 != 0){
                System.out.print(arr3[i] + " ");
            }
        }

        System.out.println();
        // condition : pick only the numbers divisible by 3
        for(int i = 0; i<arr3.length; i++){
            if(arr3[i] % 3 == 0){
                System.out.print(arr3[i] + " ");
            }
        }

        System.out.println();
        // condition : pick only the values divisible by 4
        // use while loop

        int i = 0;
        while (i < arr3.length){
            if(arr3[i] % 4 == 0){
                System.out.print(arr3[i] + " ");
            }
            i++;
        }

        System.out.println();
        // condition: pick only the numbers not divisible by 4
        // use enhanced for loop
//        for(int val : arr3){
//            if(val % 4 != 0){
//                System.out.print(val + " ");
//            }
//        }
        for(var val : arr3){
            if(val % 4 != 0){
                System.out.print(val + " ");
            }
        }







    }

}

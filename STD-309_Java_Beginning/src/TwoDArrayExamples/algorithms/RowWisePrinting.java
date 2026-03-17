package TwoDArrayExamples.algorithms;

import java.util.Arrays;

public class RowWisePrinting {

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[][] num2dArr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 4, 2, 1}};

//        for(int i = 0; i < num2dArr.length; i++){
//            printArray(num2dArr[i]);
//            System.out.println();
//        }

        for (int i = 0; i < num2dArr.length; i++) {
            System.out.println(Arrays.toString(num2dArr[i]));
        }
    }
}

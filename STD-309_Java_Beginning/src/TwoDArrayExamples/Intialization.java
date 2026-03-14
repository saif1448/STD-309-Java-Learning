package TwoDArrayExamples;

import java.util.Arrays;

public class Intialization {
    public static void main(String[] args) {
        // 1st way
        int[][] num2dArr = new int[3][4];

        // indexing ---> length - 1
        // row = 3 ---> 0 --- 2
        // col = 4 ---> 0 --- 3

        //        0  1  2  3
        // 0 -> [[2, 4, 6, 8]
        // 1 -> [1, 3, 5, 13]
        // 2 -> [7, 9, 11, 17]]

        num2dArr[0][0] = 2;
        num2dArr[0][1] = 4;
        num2dArr[0][2] = 6;
        num2dArr[0][3] = 8;

        num2dArr[1][0] = 1;
        num2dArr[1][1] = 3;
        num2dArr[1][2] = 5;
        num2dArr[1][3] = 13;

        num2dArr[2][0] = 7;
        num2dArr[2][1] = 9;
        num2dArr[2][2] = 11;
        num2dArr[2][3] = 17;

        System.out.println(Arrays.toString(num2dArr));

        System.out.println(num2dArr.length);

        // As the length is 3, means it only focus how many 1d arrays are stacked into it
        // it does not concern the length of the 1d array

        for(int i = 0; i < num2dArr.length; i++){

            System.out.println(Arrays.toString(num2dArr[i]));
        }



    }
}

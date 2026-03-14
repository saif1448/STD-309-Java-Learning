package TwoDArrayExamples;

import java.util.Arrays;

public class JaggeredArray {
    public static void main(String[] args) {
        int[][] num2dArr = new int[3][];

        // This is a jaggered Array
        // here each 1d array has different length
        num2dArr[0] = new int[]{2, 4, 6, 8, 10, 12, 100};
        num2dArr[1] = new int[]{1, 3, 5, 13};
        num2dArr[2] = new int[]{7, 9, 11, 17, 23, 31};

        for(int i = 0; i < num2dArr.length; i++){
            System.out.println(Arrays.toString(num2dArr[i]));
        }

    }
}

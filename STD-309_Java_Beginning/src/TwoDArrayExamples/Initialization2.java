package TwoDArrayExamples;

import java.util.Arrays;

public class Initialization2 {
    public static void main(String[] args) {

        // Initializaiton 2nd way
        int[][] num2dArr = {{2, 4, 6, 8}, {1, 3, 5, 13}, {7, 9, 11, 17}};

        for(int i = 0; i < num2dArr.length; i++){
            System.out.println(Arrays.toString(num2dArr[i]));
        }



    }
}

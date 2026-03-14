package TwoDArrayExamples;

import java.util.Arrays;

public class Initialization3 {
    public static void main(String[] args) {

        int[][] num2dArr = new int[3][];

        num2dArr[0] = new int[]{2, 4, 6, 8};
        num2dArr[1] = new int[]{1, 3, 5, 13};
        num2dArr[2] = new int[]{7, 9, 11, 17};

        for(int i = 0; i < num2dArr.length; i++){
            System.out.println(Arrays.toString(num2dArr[i]));
        }

    }
}

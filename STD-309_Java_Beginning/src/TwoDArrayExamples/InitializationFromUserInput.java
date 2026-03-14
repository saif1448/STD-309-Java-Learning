package TwoDArrayExamples;

import java.util.Arrays;
import java.util.Scanner;

public class InitializationFromUserInput {
    public static void main(String[] args) {
        int[][] num2dArr = new int[3][4];
        Scanner sc = new Scanner(System.in);
        //        0  1  2  3
        // 0 -> [[2, 4, 6, 8]
        // 1 -> [1, 3, 5, 13]
        // 2 -> [7, 9, 11, 17]]

        // 00 01 02 03
        // 10 11 12 13
        // 20 21 22 23
        for(int i =0; i<num2dArr.length; i++){
            for(int j = 0; j<num2dArr[i].length; j++){
                System.out.print(i+""+j+" "+"-> ");
                int num = sc.nextInt();
                num2dArr[i][j] = num;
            }
        }

        for(int i = 0; i < num2dArr.length; i++){
            System.out.println(Arrays.toString(num2dArr[i]));
        }


    }
}

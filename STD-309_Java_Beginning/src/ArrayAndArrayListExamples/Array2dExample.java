package ArrayAndArrayListExamples;

import java.util.Arrays;

public class Array2dExample {

    public static void main(String[] args) {

        int row = 3;
        int col = 4;
        int[][] arr2d = new int[row][col];

        arr2d[1][0] = 20;


        for(int i = 0; i < row; i++){
//            for(int j = 0; j<col ; j++){
//                System.out.print(arr2d[i][j] + "   ");
//            }
            for(int j = 0; j<arr2d[i].length; j++){
                System.out.print(arr2d[i][j] + "   ");
            }
            System.out.println();
        }
    }


}

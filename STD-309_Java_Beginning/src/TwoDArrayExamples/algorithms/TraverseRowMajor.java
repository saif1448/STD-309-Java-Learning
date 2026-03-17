package TwoDArrayExamples.algorithms;

public class TraverseRowMajor {

    public static void main(String[] args) {
        //  0 1 2 3
        // [1,2,3,4] --> 0
        // [5,6,7,8] --> 1
        // [9,4,2,1] --> 2

        // when we want to print or traverse data in row by row, this is row major

        // 00 01 02 03 10 11 12 13 20 21 22 23

        // i --> row --> how many 1d arrays you have ---> num2darr.length
        // j --> col ---> what is the ith 1d array size

        // i0j0 i0j1 i0j2 i0j3
        // i1j0 i1j1 i1j2 i1j3
        // i2j0 i2j1 i2j2 i2j3

        int[][] num2dArr = {{1,2,3,4}, {5,6,7,8}, {9,4,2,1}};

        // 0th array:-> 1 2 3 4
        // 1th array:-> 5 6 7 8
        // 2th array:-> 9 4 2 1
        for(int i = 0; i< num2dArr.length; i++){
            System.out.print(i+"th array:-> ");
            for(int j = 0; j < num2dArr[i].length; j++){
                System.out.print(num2dArr[i][j]+" ");
            }
            System.out.println();
        }



    }
}

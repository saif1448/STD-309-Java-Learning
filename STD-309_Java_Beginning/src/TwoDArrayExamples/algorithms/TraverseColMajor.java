package TwoDArrayExamples.algorithms;

public class TraverseColMajor {

    public static void main(String[] args) {
        //  0 1 2 3
        // [1,2,3,4] --> 0
        // [5,6,7,8] --> 1
        // [9,4,2,1] --> 2

        // 00 10 20  01 11 21 02 12 22 03 13 23


        // j ---> col
        // i ---> row

        // i0j0 i1j0 i2j0
        // i0j1 i1j1 i2j1
        // i0j2 i1j2 i2j2
        // i0j3 i1j3 i2j3

        // we assume every 1d array has fixed length

        int[][] num2dArr = {{1,2,3,4}, {5,6,7,8}, {9,4,2,1}};

        for(int j = 0; j < num2dArr[0].length; j++){
            for(int i = 0; i < num2dArr.length; i++){
                System.out.print("i"+i+"j"+j+": "+num2dArr[i][j] + " ");
            }

            System.out.println();
        }

    }
}

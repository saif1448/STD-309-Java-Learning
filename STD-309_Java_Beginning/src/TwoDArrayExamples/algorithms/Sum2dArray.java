package TwoDArrayExamples.algorithms;

public class Sum2dArray {

    public static void main(String[] args) {
        int[][] num2dArr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 4, 2, 1}};


        // [1, 2, 3]
        // [4, 5, 6]
        // [7, 8, 9]

        //  0 1 2 3
        // [1,2,3,4] --> 0
        // [5,6,7,8] --> 1
        // [9,4,2,1] --> 2

        // row wise
        // 0 row sum --> 1 + 2 + 3 + 4 = 10
        // 1 row sum --> 5 + 6 + 7 + 8 = 26
        // 2 row sum --> 9 + 4 + 2 + 1 = 16
        // total sum = 10 + 24 + 16 = 52

        int totalSum = 0;

        for(int[] arr : num2dArr){
            int rowSum = 0;
            for(int num : arr){
                rowSum+=num;
            }
            System.out.println("Row Sum: " + rowSum);
            totalSum+=rowSum;
        }

        System.out.println("Total Sum: "+ totalSum);

    }
}

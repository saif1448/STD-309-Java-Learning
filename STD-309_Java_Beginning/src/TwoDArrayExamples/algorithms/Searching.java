package TwoDArrayExamples.algorithms;

public class Searching {

    public static int[] searchElemente(int[][] inputArr, int element){
        int[] output = new int[2];

        for(int i = 0; i < inputArr.length; i++){
            for(int j = 0; j < inputArr[i].length; j++){
                if(inputArr[i][j] == element){
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }

        output[0] = -1;
        output[1] = -1;

        return output;
    }

    public static void main(String[] args) {
        int[][] num2dArr = {{1,2,3,4}, {5,6,7,8}, {9,4,2,1}};

        int[] output = searchElemente(num2dArr, 71);

        System.out.println("row: " + output[0] + " col:" + output[1]);

    }
}

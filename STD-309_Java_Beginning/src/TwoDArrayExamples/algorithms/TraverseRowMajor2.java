package TwoDArrayExamples.algorithms;

public class TraverseRowMajor2 {
    public static void main(String[] args) {
        int[][] num2dArr = {{1,2,3,4}, {5,6,7,8}, {9,4,2,1}};

        for(int[] arr: num2dArr){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------");

        for(int i = 0; i< num2dArr.length; i++){
            for(int val : num2dArr[i]){
                System.out.print(val+ " ");
            }
            System.out.println();
        }
    }
}

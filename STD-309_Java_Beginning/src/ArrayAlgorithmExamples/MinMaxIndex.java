package ArrayAlgorithmExamples;

public class MinMaxIndex {

    public static int[] minMaxIdx(int[] arr){
        int[] minMaxIdx = new int[2];

        // set the minVal with the maximum integer value
        int minVal = Integer.MAX_VALUE;
        // set minIdx = 0
        int minIdx = 0;
        // set the maxVal with the minimum integer value
        int maxVal = Integer.MIN_VALUE;
        // set maxIdx = 0
        int maxIdx = 0;
        // we are gonna initiate a for loop, i = 0
        // loop is gonna iterate till arr.length
        for(int i = 0; i < arr.length; i++){
            // inside loop
            int currentVal = arr[i];
            // if currentValue < minVal ----> minIdx with the current index
            if(currentVal < minVal){
                minIdx = i;
                minVal = currentVal;
            }
            // if currentValue > maxVal ----> maxIdx with the current index
            if(currentVal > maxVal){
                maxIdx = i;
                maxVal = currentVal;
            }
        }

        // set minMaxIdx[0] with minIdx
        minMaxIdx[0] = minIdx;
        // set minMaxIdx[1] with
        minMaxIdx[1] = maxIdx;


        // return minMaxIdx

        return minMaxIdx;

    }

    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50,60};
        int[] arr2 = {54,24,67, 89, 23, 99, 72};
        int[] arr3 = {74,56, 63, 101, 209};

        int[] res1 = minMaxIdx(arr1);
        int[] res2 = minMaxIdx(arr2);
        int[] res3 = minMaxIdx(arr3);

        System.out.println("Arr1 MinIdx: " + res1[0] + " MaxIdx: " + res1[1]);
        System.out.println("Arr2 MinIdx: " + res2[0] + " MaxIdx: " + res2[1]);
        System.out.println("Arr3 MinIdx: " + res3[0] + " MaxIdx: " + res3[1]);
    }
}

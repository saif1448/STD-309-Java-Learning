package ArrayAlgorithmExamples;

import java.util.Arrays;

public class PassArrayToFunc {

    // find the summation of the elements inside an array

    public static int findArrSum(int[] arr){
        int sum = 0;

        //
//        for(int i = 0; i < arr.length; i++){
//            sum += arr[i];
//        }
        for(int val : arr){
            sum += val;
        }
        //

        return sum;
    }

    // find Max value index
    public static int findMaxValIdx(int[] arr){
        int maxIdx = 0;
        int maxVal = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            int currVal = arr[i];
            if(currVal > maxVal){
                maxIdx = i;
            }
        }

        return maxIdx;

    }


    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50,60};
        int[] arr2 = {54,24,67, 89, 23, 99, 72};
        int[] arr3 = {74,56, 63, 101, 209};

        System.out.println(Arrays.toString(arr1));

        int sum1 = findArrSum(arr1);
        int sum2 = findArrSum(arr2);
        int sum3 = findArrSum(arr3);

        System.out.println("Arr1 sum: "+ sum1);
        System.out.println("Arr2 sum: "+ sum2);
        System.out.println("Arr3 sum: "+ sum3);

        int maxIdx1 = findMaxValIdx(arr1);
        int maxIdx2 = findMaxValIdx(arr2);
        int maxIdx3 = findMaxValIdx(arr3);

        System.out.println("Arr1: " + maxIdx1 + ", val: " + arr1[maxIdx1]);
        System.out.println("Arr2: " + maxIdx2 + ", val: " + arr2[maxIdx2]);
        System.out.println("Arr3: " + maxIdx3 + ", val: " + arr3[maxIdx3]);
    }
}

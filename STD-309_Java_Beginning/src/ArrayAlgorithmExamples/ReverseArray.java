package ArrayAlgorithmExamples;

import java.util.Arrays;

public class ReverseArray {

    // arr[] = {1,2,3,4,5}
    // reversedArr = { 5, 4, 3, 2, 1 }

    public static int[] getReversedArray(int[] arr){

        int[] reversedArr = new int[arr.length];
        // 4 ---> 0 ---> 4-4
        // 3 ---> 1 ---> 4-3
        // 2 ---> 2 ---> 4-2
        // 1 ---> 3 ---> 4-1
        // 0 ---> 4 ---> 4-0
        int initialIdx = arr.length - 1;
        for(int i = initialIdx; i >= 0; i--){
            int revIdx = initialIdx - i;
            reversedArr[revIdx] = arr[i];
        }
        return reversedArr;
    }


    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50,60};
        int[] arr2 = {54,24,67, 89, 23, 99, 72};
        int[] arr3 = {74,56, 63, 101, 209};

        int[] res1 = getReversedArray(arr1);
        int[] res2 = getReversedArray(arr2);
        int[] res3 = getReversedArray(arr3);

        System.out.println("rev arr1: " + Arrays.toString(res1));
        System.out.println("rev arr2: " + Arrays.toString(res2));
        System.out.println("rev arr3: " + Arrays.toString(res3));
    }
}

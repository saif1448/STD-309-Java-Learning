package ArrayAlgorithmExamples;

public class MinMax {

    // You have to write a method which is gonna return the minimum and maximum of an array
    // the input array will be an array of integer
    public static int[] findMinMax(int[] arr){
        int[] minMaxValues = new int[2];
        // 70, 14, 67, 89, 13, 21

        int minVal = Integer.MAX_VALUE; // int minVal = arr[0]
        int maxVal = Integer.MIN_VALUE; // int maxVal = arr[0]

        // we are gonna loop over the array
        // if the current element in the array is less than minVal, we are gonna replace the minVal with the current element
        // if the current element in the array is greater than the maxVal, we are gonna replace it with current element

//        for(int i = 0; i < arr.length; i++){
//            int currentVal = arr[i];
//            // check the min
//            if(currentVal < minVal){
//                minVal = currentVal;
//            }
//            if(currentVal > maxVal){
//                maxVal = currentVal;
//            }
//        }

        for(int currentVal : arr){
            if(currentVal < minVal){
                minVal = currentVal;
            }
            if(currentVal > maxVal){
                maxVal = currentVal;
            }
        }

        minMaxValues[0] = minVal;
        minMaxValues[1] = maxVal;

        return minMaxValues;
    }

    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50,60};
        int[] arr2 = {54,24,67, 89, 23, 99, 72};
        int[] arr3 = {74,56, 63, 101, 209};

        int[] res1 = findMinMax(arr1);
        int[] res2 = findMinMax(arr2);
        int[] res3 = findMinMax(arr3);

        System.out.println("Arr1 Min: " + res1[0] + " Max: " + res1[1]);
        System.out.println("Arr2 Min: " + res2[0] + " Max: " + res2[1]);
        System.out.println("Arr3 Min: " + res3[0] + " Max: " + res3[1]);

    }
}

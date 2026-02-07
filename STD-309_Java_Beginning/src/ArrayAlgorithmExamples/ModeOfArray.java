package ArrayAlgorithmExamples;

public class ModeOfArray {

    public static int[] findMinMax(int[] arr){
        int[] minMaxValues = new int[2];

        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;

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

    public static void printElementCounting(int[] arr){

        // arr = {10,20,10,30,20,30,40,50,30}
        // maxValue = 50
        // 0 -- 10--20----30----40---- 50
        // 0 ---0---0-----0-----0------ 0
        // -----1---0-----0-----0------0
        // -----1---1-----0-----0------0
        // -----2---1-----0-----0------0

        // 1. finding the maximum value from the array
        int[] minMaxValues = findMinMax(arr);
        int maxValue = minMaxValues[1] + 1; // 50 ---> arr[51] -- 50

        // 2. initiating a blank with maximum index of maxValue
        int[] frequencyArray = new int[maxValue]; // we are creating an array with size maxValue

//        for(int i = 0; i < maxValue; i++){
//            frequencyArray[i] = 0;
//        }

        // every index value in java here is automatically assigned a 0 value initially

        for(int element : arr){
            // element = 10
            // frequencyArray[10]++ ---> 0 -> 1, 1 -> 2
            // 3. Incrementing the counting of frequency array with the element treated as index in frequency Array
            frequencyArray[element]++;
        }

        // 4. Now we are printing the for each index where the counting is not 0
        int maxFreq = Integer.MIN_VALUE;
        int mode = 0;
        for(int i = 0; i < frequencyArray.length; i++){
            if(frequencyArray[i] != 0){
                System.out.println(i + ": " + frequencyArray[i]);
            }
            if(frequencyArray[i] > maxFreq){
                maxFreq = frequencyArray[i];
                mode = i;
            }
        }


//        int[] minMaxIdx = minMaxIdx(frequencyArray);
//        int mode = minMaxIdx[1];
        System.out.println("Mode: ");
        System.out.println(mode + ": " + frequencyArray[mode]);
    }

    public static void main(String[] args) {

        int[] arr = {10,20,10,30,20,30,40,50,30};
        printElementCounting(arr);
        System.out.println("-------------------------");
        int[] arr2 = {1,5,3,7,4,3,2,1,6,9};
        printElementCounting(arr2);
        // String = "This is a string" ---> counting the frequency of the character
        // String = "This is a string" ---> counting the frequency of the vowels
        // String = "This is a string" ---> counting the frequency of the consonant
        // String = "This is a string" ---> counting the frequency of the substring


    }
}

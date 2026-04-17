package SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {

    public static void selectionSortList(List<Integer> numList){

        for(int i = 0; i< numList.size(); i++){
            int currentMin = numList.get(i);
            int currentMinIdx = i;

            //find minimum
            for(int j = i+1; j < numList.size(); j++){
                if(numList.get(j) < currentMin){
                    currentMin = numList.get(j);
                    currentMinIdx = j;
                }
            }
            //swap
            int temp = numList.get(i);
            numList.set(i, numList.get(currentMinIdx));
            numList.set(currentMinIdx, temp);
        }

    }

    public static void selectionSortArr(int[] numArr){
        for(int i = 0; i< numArr.length; i++){
            int currentMin = numArr[i];
            int currentMinIdx = i;

            //find minimum
            for(int j = i + 1; j < numArr.length; j++){
                if(numArr[j] < currentMin){
                    currentMin = numArr[j];
                    currentMinIdx = j;
                }
            }

            //swap
            int temp = numArr[i];
            numArr[i] = currentMin;
            numArr[currentMinIdx] = temp;
        }
    }

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(List.of(4, 5, 6, 10, 1, 4, 12, 5, 31, 9, 45, 17));
        int[] numArr = {4, 5, 6, 10, 1, 4, 12, 5, 31, 9, 45, 17};

        System.out.println("Before sorting the list: ");
        System.out.println(numList);
        selectionSortList(numList);
        System.out.println("After sorting the list: ");
        System.out.println(numList);

        System.out.println("-------------------------------");

        System.out.println("Before sorting the array: ");
        System.out.println(Arrays.toString(numArr));
        selectionSortArr(numArr);
        System.out.println("After sorting the array: ");
        System.out.println(Arrays.toString(numArr));
    }

}

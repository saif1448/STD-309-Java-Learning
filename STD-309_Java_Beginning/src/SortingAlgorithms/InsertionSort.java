package SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {

    // 1, 4, 5, 6, 10, 4, 12, 5, 31, 9, 45, 17
    // 1, 4, 5, 6, 10, 10
    // 1, 4, 5, 6, 6, 10
    // 1, 4, 5, 5, 6, 10
    // 1, 4, 4, 5, 6, 10, 12, 5, 31, 9, 45, 17
    public static void insertionSortList(List<Integer> numList) {
        for(int i = 1; i < numList.size(); i++){
            int currentVal = numList.get(i);
            int sortedIdx = i - 1;

            // sortecIdx = -1  && 4 > 1
            while (sortedIdx >= 0 && numList.get(sortedIdx) > currentVal){
                numList.set(sortedIdx+1, numList.get(sortedIdx));
                //         1                 4
                // 1, 4, 5, 6, 10, 4, 12, 5, 31, 9, 45, 17
                sortedIdx--;
            }

            numList.set(sortedIdx + 1, currentVal);
        }
    }

    public static void insertionSortArr(int[] numArr) {

    }

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(List.of(4, 5, 6, 10, 1, 4, 12, 5, 31, 9, 45, 17));
        int[] numArr = {4, 5, 6, 10, 1, 4, 12, 5, 31, 9, 45, 17};

        System.out.println("Before sorting the list: ");
        System.out.println(numList);
        insertionSortList(numList);
        System.out.println("After sorting the list: ");
        System.out.println(numList);

        System.out.println("-------------------------------");

        System.out.println("Before sorting the array: ");
        System.out.println(Arrays.toString(numArr));
        insertionSortArr(numArr);
        System.out.println("After sorting the array: ");
        System.out.println(Arrays.toString(numArr));
    }
}

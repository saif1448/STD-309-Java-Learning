package SortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void bubbleSortList(List<Integer> numList) {
        for(int i = 0; i< numList.size(); i++){
            for(int j = 0; j < numList.size() - 1 - i; j++ ){
                   if(numList.get(j) > numList.get(j+1)){
                       int temp = numList.get(j);
                       numList.set(j, numList.get(j+1));
                       numList.set(j+1, temp);
                   }
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>(List.of(4, 5, 6, 10, 1, 4, 12, 5, 31, 9, 45, 17));
        int[] numArr = {4, 5, 6, 10, 1, 4, 12, 5, 31, 9, 45, 17};

        System.out.println("Before sorting the list: ");
        System.out.println(numList);
        bubbleSortList(numList);
        System.out.println("After sorting the list: ");
        System.out.println(numList);

    }
}

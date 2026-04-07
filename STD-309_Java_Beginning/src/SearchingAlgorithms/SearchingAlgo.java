package SearchingAlgorithms;

import java.util.*;
import java.util.ArrayList;

public class SearchingAlgo {

    // It is gonna compare n times in the worst case if the size of the list is n
    // time complexity O(n) ---> worst case time complexity
    // Linear Search
    public static int linearSearch(List<Integer> numList, int item){
        for(int i = 0; i < numList.size(); i++){
            if(numList.get(i) == item){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(List<Integer> numList, int item){
        int l = 0;
        int h = numList.size()-1;

        // 1, 2 3, 4 ,5, 6, 7, 8, 9, 10, 11
        // 15
        // l = 0, h = 10
        // m  = 5
        // list(m) == 6 , 15 > 6
        // l = m+ 1 = 6
        // 7, 8, 9, 10, 11
        // 6            10
        // m     8
        // list(m) = 9, 15 > 9
        // 10, 11
        // 9   10
        // m = 9 + 10 / 2 = 9
        // list(m) = 10 , 15 > 10
        // l = 10 , h = 10
        // m = 10, list(m) = 11 , 15 > 11
        // l = m+1 = 11
        // l = 11, h = 10

        while (l <= h){
            int m = (l+h)/2;
            int middleValue = numList.get(m);
            if(middleValue == item){
                return m;
            }
            if(item > middleValue){
                l = m + 1;
            }
            if(item < middleValue){
                h = m - 1 ;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // 100

        List<Integer> numList = new ArrayList<>(List.of(10,20, 30, 40, 50, 60, 70, 80, 90, 1000));
//        int idx = linearSearch(numList, 40);
        int idx = binarySearch(numList, 40);
        System.out.println(idx);

        // 2 types of searching algorithms
        // 1. Linear Search O(n) ---> 10
        // 2. Binary Search O(log n) --> 3.32

        // for Binary Search, the criteria is the array should be sorted

    }
}

package ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListObjectSetandGet {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

//        System.out.println(arr[2]); // showing index 2 value
        System.out.println(Arrays.toString(arr));

        // change array 3 index value to 70
        arr[3] = 70;

        System.out.println(Arrays.toString(arr));

        // {1,3,4,5,0}
        System.out.println(arr.length);

        //--------------------------------------------------------------

        ArrayList<Integer> arr1= new ArrayList<>(List.of(1,2,3,4,5));

        System.out.println(arr1.get(2)); // it is gonna return index 2 value of the arraylist

        arr1.set(3, 70); // it is updating the value at index 3

        System.out.println(arr1);

        // removing

        arr1.remove(1); // it is gonna remove value from index 1
        System.out.println(arr1);


        // size() ---> it shows the length of the arraylist

        System.out.println(arr1.size());
    }

}

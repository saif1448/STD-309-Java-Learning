package ArrayListExamples;

import java.util.ArrayList;


public class ArrayListCreation {
    public static void main(String[] args) {

        // ArrayList works only with objective type
        // So to create an array list of integer ---> we have to use objective type of int
        // Integer is the objective wrapper type of
        // Integer --> int

        // it is a blank array list
        ArrayList<Integer> numList = new ArrayList<>();

        //insert
        numList.add(30); // 0 --> 30
        numList.add(40); // 1 --> 40
        numList.add(50); // 2 --> 50
        numList.add(60); // 3 --> 60

        System.out.println(numList.size());

        numList.add(70);
        System.out.println(numList.size());

        System.out.println(numList);

        numList.add(80);

        System.out.println(numList);

    }
}


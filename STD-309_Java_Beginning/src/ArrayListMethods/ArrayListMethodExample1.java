package ArrayListMethods;

import ClassExamples.Student;

import java.util.List;
import java.util.ArrayList;


public class ArrayListMethodExample1 {

    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<>();
//        List<Integer> numList = new ArrayList<>();

        // Adding data into arrayList
        // add()

        numList.add(10); // index 0
        numList.add(20); // index 1
        numList.add(30); // index 2

        System.out.println(numList);

        // [10, 20, 30]
        // if we insert 70 at index 1
        // [10, 70, 20, 30]

        numList.add(1, 70); // inserting 70 at index 1

        System.out.println(numList);

//        ArrayList<Object> objList = new ArrayList<>();
//
//        objList.add("Saif");
//        objList.add(20);
//        objList.add(new Student());
//        objList.add(22.81);
//
//        System.out.println(objList);


    }
}

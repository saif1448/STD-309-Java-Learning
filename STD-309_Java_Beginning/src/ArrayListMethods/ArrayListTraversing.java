package ArrayListMethods;

import java.util.ArrayList;

public class ArrayListTraversing {

    public static void main(String[] args) {

        ArrayList<String> fruitList = new ArrayList<>();

        fruitList.add("apple");
        fruitList.add("orange");
        fruitList.add("banana");
        fruitList.add("strawberry");
        fruitList.add("blueberry");

        // best way to use enhanced for loop
        for(String fruit : fruitList){
            System.out.println(fruit);
        }
        System.out.println("-------------------------------");
        for(int i = 0; i < fruitList.size(); i++){
            System.out.println(fruitList.get(i));
        }


        String fruit = fruitList.set(2, "pineapple"); // it is popping the value at index 2 --- banana , and replacing it with pineapple afterwards

        System.out.println(fruitList);
        System.out.println(fruit);

    }
}

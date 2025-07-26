package LoopExamples;

import java.util.ArrayList;
import java.util.List;
public class ExtendedForLoopExample {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90,100));
        //ls = [10,20,30,40,50,60,70,80,90,100]
        for(var i : numberList ){
            System.out.println(i);
        }
    }
}

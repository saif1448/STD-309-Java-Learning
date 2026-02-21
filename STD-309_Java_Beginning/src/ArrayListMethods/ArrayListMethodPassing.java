package ArrayListMethods;

import MiscExamples.ObjectReferencingExample.Student;

import java.util.ArrayList;

public class ArrayListMethodPassing {

    public static ArrayList<String> removeItem(ArrayList<String> inputList, String removeItem){
        ArrayList<String> resultList = new ArrayList<>();

        for(var item : inputList){
            if(!item.equals(removeItem)){
                resultList.add(item);
            }
        }
        return  resultList;
    }

    public static void main(String[] args) {
        ArrayList<String> qualityList = new ArrayList<>();

        qualityList.add("good");
        qualityList.add("good");
        qualityList.add("bad");
        qualityList.add("bad");
        qualityList.add("good");
        qualityList.add("good");
        qualityList.add("bad");
        qualityList.add("good");
        qualityList.add("good");
        qualityList.add("bad");
        qualityList.add("good");
        qualityList.add("good");

        System.out.println(qualityList);

        ArrayList<String> resultGood = removeItem(qualityList, "bad");
        ArrayList<String> resultBad = removeItem(qualityList, "good");

        System.out.println(resultGood);
        System.out.println(resultBad);
    }
}

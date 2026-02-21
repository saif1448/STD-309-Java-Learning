package ArrayListMethods.ArrayListAlgorithms;

import java.util.ArrayList;

public class ArrayListMethodPassingModIntput {

    public static void removeItem(ArrayList<String> inputList, String removeItem){
        for(int i = 0; i < inputList.size(); i++){
            if(inputList.get(i).equals(removeItem)){
                inputList.remove(i);
                i--;
            }
        }
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

        removeItem(qualityList, "bad");

        System.out.println(qualityList);
    }
}

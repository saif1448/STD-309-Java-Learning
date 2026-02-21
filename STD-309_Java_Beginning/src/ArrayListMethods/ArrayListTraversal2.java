package ArrayListMethods;

import java.util.ArrayList;

public class ArrayListTraversal2 {
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

        for(var item : qualityList){
            System.out.println(item);
        }
    }
}

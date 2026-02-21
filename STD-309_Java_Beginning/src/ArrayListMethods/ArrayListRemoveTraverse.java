package ArrayListMethods;

import java.util.ArrayList;

public class ArrayListRemoveTraverse {
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
        // idx == 0 good  i = 0
        // idx == 1 good  i = 1
        // idx == 2 bad   i = 2 ----> remove(i--)  i++
        // idx == 3 good  i = 3
        // idx == 4



//        for(int i = 0; i< qualityList.size(); i++){
//            if(qualityList.get(i).equals("bad")){
//                qualityList.remove(i);
//                i--;  // solution is to add a decrement
//            }
//        }

        ArrayList<String> tempList = new ArrayList<>();

        for(String quality : qualityList){
            if(!quality.equals("bad")){
                tempList.add(quality);
            }
        }

        qualityList = tempList;

        System.out.println(qualityList);

    }
}

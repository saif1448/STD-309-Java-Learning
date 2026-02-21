package ArrayListMethods;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTraversingIterator {
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

        Iterator<String> qualityListIterator = qualityList.iterator();

        while (qualityListIterator.hasNext()){
//            System.out.println(qualityListIterator.next());
            String item = qualityListIterator.next();
            if(item.equals("bad")){
                qualityListIterator.remove();
            }
        }

        System.out.println(qualityList);
    }
}

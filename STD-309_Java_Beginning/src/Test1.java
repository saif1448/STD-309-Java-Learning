import java.util.Arrays;
import java.util.*;
public class Test1 {

    public static void main(String[] args) {

         List<Integer> numList  = new ArrayList<>(List.of(4,5,6,10,1,4,12,5,31,9,45,17));

         numList.sort((a, b) -> a -b);

        System.out.println(numList);

    }

}
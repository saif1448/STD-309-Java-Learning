import java.util.Arrays;
import java.util.*;

public class Test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> numList = new ArrayList<>(List.of(4, 5, 6, 10, 1, 4, 12, 5, 31, 9, 45, 17));

        System.out.println("Enter i: ");
        int i = sc.nextInt();

        System.out.println("Enter j: ");
        int j = sc.nextInt();

//        int a = 20;
//        int b = 30;
//
//        System.out.println("Before swap: a:" + a + ", b:" + b);
        System.out.println(numList);
        int temp = numList.get(i);
        numList.set(i, numList.get(j));
        numList.set(j, temp);

//        System.out.println("After swap: a:" + a + ", b:" + b);

        System.out.println(numList);

    }

}
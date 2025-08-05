package ArrayAndArrayListExamples;

import java.util.Random;

public class ArrayExample3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        Random random = new Random();

        for(int i=0; i < arr.length; ){
            System.out.println(arr[i]);
            int random_number = random.nextInt(1,3);
            // it is gonna increment the value of i either by 1 or by 2
            // i = i + 1 or
            // i = i + 2
            i+= random_number;
        }


    }
}

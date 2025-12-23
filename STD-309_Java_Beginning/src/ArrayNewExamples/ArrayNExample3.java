package ArrayNewExamples;

public class ArrayNExample3 {
    public static void main(String[] args) {

        int[] numArr = {10,20,30,40,50,60,70,80,90};

        System.out.println(numArr.length);

        int size = numArr.length;

        for(int i = 0; i < size; i++){
            System.out.println(i+"--->"+ numArr[i]);
        }


    }
}

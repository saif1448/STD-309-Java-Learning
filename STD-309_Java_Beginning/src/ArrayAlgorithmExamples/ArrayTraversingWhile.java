package ArrayAlgorithmExamples;

public class ArrayTraversingWhile {
    public static void main(String[] args) {
        int[] arr = {54,24,67, 89, 23, 99, 72};

        // for loop with indexing
        // for loop ---> enhanced for loop
        // while loop

//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }

        int i = 0;
        while (i < arr.length){
            System.out.println(arr[i]);
            i++;
        }

    }
}

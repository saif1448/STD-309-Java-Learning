package ArrayAlgorithmExamples;

public class ComplexityExample {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};

        // Find the the sum of the elements of the array

        // O(n) ---> it is gonna do the sum n times
//        int sum = 0;
//        for(int element : arr){
//            sum += element;
//        }
//
//        System.out.println("Sum: " + sum);

        int sum = arr.length/2*(arr[0] + arr[arr.length-1]); // O(1)

        System.out.println("Sum: " + sum);
    }
}

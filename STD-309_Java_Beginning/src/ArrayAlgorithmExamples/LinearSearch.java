package ArrayAlgorithmExamples;

public class LinearSearch {

    // To find an element inside an array
    // if the element is present we are gonna return the index of that element
    // if the element is not present we are gonna return -1

    // It is gonna be dependent on linear search
    // int[] arr
    public static int findElement(int element, int[] arr){

        // we are gonna check if the element is equal to the element of and index
        // if the element is present at i index, we are gonna return i

        // arr size --- n
        // i = 0 ---> 1
        // condition ---> 5
        // increment ---> 5
        // inner condition ----> 5
        // return 1

        // 1 + 5 + 5 + 5 + 1
        // 2*1 + 3*n

        // 3*n
        // n
        // O(n) ---> complexity


        // 10, 20, 30, 40, 50 ---> 500

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] arr1 = {10,20,30,40,50,60};
        int[] arr2 = {54,24,67, 89, 23, 99, 72};
        int[] arr3 = {74,56, 63, 101, 209};

        System.out.println(findElement(50, arr1));
        System.out.println(findElement(909, arr2));
        System.out.println(findElement(101, arr3));
    }
}

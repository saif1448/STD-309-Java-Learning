package ArrayAndArrayListExamples;

public class ArrayExample {
    public static void main(String[] args) {

        //type[] variable_name = new type[length];

        //Creating the array
        // It will create a blank array, the length will be 10 here
        //2030+ 16*0
        // 2030 + 16*1
        // 2030 + 16*2
        int[] arr = new int[10];

        //Inserting into the array
        //Later you can insert the data
        arr[0] = 20;
        arr[4] = 50;

        arr[6] = 120;


        //Traversing the array
        for(int a : arr){
            System.out.println(a);
        }

        System.out.println("------------------------------------");
//
//        arr[4] = 200;
//
//        for(int a : arr){
//            System.out.println(a);
//        }


        //The array is created on the fly
        //The length will be determined depending on how much elements are inserted here
        // 1001 + 64*0
        // 1001 + 64*1
        // 1001 + 64*2
        //                 0     1    2
        //               1001  1065  1129
        double[] arr2 = {10.2, 20.2, 30.3};

        //To check the length of any array, use the .length

        System.out.println(arr2.length);

        for(int i=0; i < arr2.length; i++ ){
            System.out.println(arr2[i]);
        }


        System.out.println("----------------------------");

        System.out.println(arr);
        System.out.println(arr2);




    }
}

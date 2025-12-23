package ArrayNewExamples;

public class ArrayNExample1 {
    public static void main(String[] args) {

        boolean[] arr = new boolean[10];

        System.out.println(arr[9]);

        // integer ---> default = 0

        Student[] studentArray = new Student[5];
        System.out.println(studentArray[3]);

        int[] numArr = {10,20,30,40,50};
        System.out.println(numArr[3]);

        Student[] stdArr = {
                new Student("ABC", 123),
                new Student("XYZ", 456),
                new Student("OQR", 897)
        };

        System.out.println(stdArr[1]);



    }
}

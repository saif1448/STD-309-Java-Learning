package ArrayNewExamples;

public class ArrayNExample2 {
    public static void main(String[] args) {
        int[] numArr = new int[5];
        System.out.println(numArr[2]);
        // we are updating the value into index 2

        numArr[2] = 50;
        System.out.println(numArr[2]);

        Student[] stdArr = new Student[5];
        System.out.println(stdArr[3]);

        stdArr[3] = new Student("AVS", 123);
        System.out.println(stdArr[3]);
        stdArr[3].setName("XYZ");
        System.out.println(stdArr[3].getName());

        Student[] stdArr2 = {
                new Student("ABC", 123),
                new Student("XYZ", 456),
                new Student("OQR", 897)
        };
        System.out.println(stdArr2[1]);
        System.out.println(stdArr2[1].hashCode());
        stdArr2[1] = new Student("UWE", 369);
        System.out.println(stdArr2[1]);
        System.out.println(stdArr2[1].hashCode());
    }
}

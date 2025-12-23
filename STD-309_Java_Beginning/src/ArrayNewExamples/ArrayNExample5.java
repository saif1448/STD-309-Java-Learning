package ArrayNewExamples;

public class ArrayNExample5 {
    public static void main(String[] args) {
        Student[] stdArr = {
                new Student("ABC", 123),
                new Student("XYZ", 456),
                new Student("OQR", 897),
                new Student("PQR", 897),
                new Student("IOW", 897),
        };
// stdArr = ["ABCD", "BAS", "CASS"]
//        for val in stdArr:
//            print(val)

        for(Student val : stdArr){
            System.out.println(val);
        }


        int[] numArray = {10,20,30,40,50,60};

        for(int num : numArray){
            System.out.println(num);
        }

    }

}

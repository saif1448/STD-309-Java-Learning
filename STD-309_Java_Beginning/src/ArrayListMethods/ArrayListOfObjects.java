package ArrayListMethods;

import MiscExamples.ObjectReferencingExample.Student;

import java.util.ArrayList;

public class ArrayListOfObjects {

    public static void main(String[] args) {
        Student std1 = new Student("ABC", "123");
        Student std2 = new Student("XYZ", "456");
        Student std3 = new Student("PQR", "782");

        ArrayList<Student> stdList = new ArrayList<>();

        stdList.add(std1);
        stdList.add(std2);
        stdList.add(std3);

        System.out.println(stdList);

        // insert a student at index 2
        stdList.add(2, new Student("TYC", "891"));

        System.out.println(stdList);

    }
}

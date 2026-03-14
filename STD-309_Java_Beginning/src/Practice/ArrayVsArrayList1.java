package Practice;

import MiscExamples.ObjectReferencingExample.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList1 {
    public static void main(String[] args) {

        Student[] stdArray = new Student[5];

//        Student[] stdArray = {
//        new Student("S1", "01"),
//        new Student("S2", "02"),
//        new Student("S3", "03"),
//        new Student("S4", "04"),
//        new Student("S5", "05")
//        };

        Student s1 = new Student("S1", "01");
        Student s2 = new Student("S2", "02");
        Student s3 = new Student("S3", "03");
        Student s4 = new Student("S4", "04");
        Student s5 = new Student("S5", "05");

        stdArray[3] = s1;
        stdArray[2] = s5;
        stdArray[1] = s3;
        stdArray[4] = s2;
        stdArray[0] = s4;

        System.out.println(Arrays.toString(stdArray));

        ArrayList<Student> stdList  = new ArrayList<>();


        System.out.println(stdList);

        stdList.add(new Student("S1", "01"));
        stdList.add( new Student("S2", "02"));
        stdList.add( new Student("S3", "03"));
//        System.out.println(stdList);
        stdList.add(new Student("S4", "04"));

        stdList.add(2, new Student("56", "56"));

        ArrayList<Student> stdList2 = new ArrayList<>();
        stdList2.add(new Student("45", "45"));
        stdList2.add(new Student("46", "46"));

        ArrayList<Student> stdList3 = new ArrayList<>();
        stdList3.add(new Student("51", "51"));
        stdList3.add(new Student("56", "56"));


        stdList.addAll(stdList2);

        System.out.println(stdList);




    }
}

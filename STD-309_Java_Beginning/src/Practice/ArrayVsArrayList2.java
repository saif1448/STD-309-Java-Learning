package Practice;

import MiscExamples.ObjectReferencingExample.Student;

import java.util.Arrays;

public class ArrayVsArrayList2 {

    public static void add(Student[] stdArray, Student newStudent, int idx) {

        // s1, s2, s3, s4, null
        // s1, s2, s3, s4, s4
        // s1, s2, s3, s3, s4
        // s1, s2, s2, s3, s4
        // s1, newStudent, s2, s3, s4

        // shift elements to the right
        for (int i = stdArray.length - 1; i > idx + 1; i--) {
            stdArray[i] = stdArray[i - 1];
        }

        // insert new student
        stdArray[idx + 1] = newStudent;
    }

    public static void main(String[] args) {

        Student[] stdArray = new Student[5];

        Student s1 = new Student("S1", "01");
        Student s2 = new Student("S2", "02");
        Student s3 = new Student("S3", "03");
        Student s4 = new Student("S4", "04");
        Student s5 = new Student("S5", "05");

        stdArray[3] = s1;
        stdArray[2] = s5;
        stdArray[1] = s3;
//        stdArray[4] = s2;
        stdArray[0] = s4;

        add(stdArray,  new Student("s56", "56"), 1);

        System.out.println(Arrays.toString(stdArray));


    }
}

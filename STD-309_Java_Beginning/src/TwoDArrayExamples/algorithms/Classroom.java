package TwoDArrayExamples.algorithms;

import MiscExamples.ObjectReferencingExample.Student;

import java.util.Arrays;

public class Classroom {

    private Student[] studentArray;

    public Classroom(Student[] studentArray) {
        this.studentArray = studentArray;
    }

    public Student[] getStudentArray() {
        return studentArray;
    }

    public void setStudentArray(Student[] studentArray) {
        this.studentArray = studentArray;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "studentArray=" + Arrays.toString(studentArray) +
                '}';
    }
}

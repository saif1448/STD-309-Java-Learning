package TwoDArrayExamples.algorithms;

import MiscExamples.ObjectReferencingExample.Student;

public class TwoDObject {
    public static void main(String[] args) {
        // Classroom ---> c1, c2 c3 ----
        // c1 ---> std1 std2 std3
        // std1 marks --> m --->

        Classroom[] classrooms = new Classroom[3];

        Student[] clsRm1 = {
                new Student("ABC", "01", 78),
                new Student("DEF", "02", 79),
                new Student("PQR", "03", 80),
                new Student("WXC", "04", 81),
        };

        Student[] clsRm2 = {
                new Student("POQ", "08", 78),
                new Student("UIO", "09", 79),
                new Student("LKAS", "10", 80),
        };

        Student[] clsRm3 = {
                new Student("TBC", "31", 78),
                new Student("TEF", "32", 79),
                new Student("TQR", "33", 80),
                new Student("TXC", "34", 81),
                new Student("TXC", "35", 81),
        };

        Classroom classroom1 = new Classroom(clsRm1);
        Classroom classroom2 = new Classroom(clsRm2);
        Classroom classroom3 = new Classroom(clsRm3);

        classrooms[0] = classroom1;
        classrooms[1] = classroom2;
        classrooms[2] = classroom3;


        // Classroom 01
            // std1 --->
            // std2 --->

        for(int i = 0; i < classrooms.length; i++){
            System.out.println("Classroom 0" + (i+1));
            System.out.println("-------------------------");
            Student[] students = classrooms[i].getStudentArray();
            for(int j = 0; j < students.length; j++){
                System.out.println("STD 0" + (j+1) + " " + students[j]);
            }
        }


    }
}

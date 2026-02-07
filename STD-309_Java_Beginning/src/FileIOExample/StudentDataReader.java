package FileIOExample;

import java.io.File;
import java.util.Scanner;

public class StudentDataReader {

    public static void main(String[] args) throws Exception {

        Student[] studentArray = new Student[50];

        String filePath = "src/FileIOExample/student_data.txt";
        File studentFile = new File(filePath);

//        try {
            Scanner sc = new Scanner(studentFile);
            sc.nextLine();
            int i = 0;
            while (sc.hasNext()){
                String line = sc.nextLine();
                String[] data = line.split(",");
                String name = data[0];
                String grade = data[1];
                String cgpa = data[2];
                Student newStudent = new Student(name, grade, cgpa);
                studentArray[i] = newStudent;
                i++;
//                System.out.println(line);
            }
            sc.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        boolean hasEveryNameStartsWithA = true;
        boolean hasAnyNameStartsWIthA = false;

        for(Student std : studentArray){
           if(std != null){
               System.out.println(std);
               if(!std.getName().startsWith("A")){
                   hasEveryNameStartsWithA = false;
               }
               if(std.getName().startsWith("A")){
                   hasAnyNameStartsWIthA = true;
               }
           }
        }

        System.out.println("Does every name starts with A: " + hasEveryNameStartsWithA);

        System.out.println("Does any name starts with A: " + hasAnyNameStartsWIthA);

        System.out.println("Student data reading finished");

    }
}

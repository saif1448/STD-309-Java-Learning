package SearchingAlgorithms;
import java.util.*;
public class SearchingAlgoObj {
    public static class Student{
        private String name;
        private int marks;

        public Student(String name, int marks){
            this.name = name;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMarks() {
            return marks;
        }

        public void setMarks(int marks) {
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }

    }

    public static int linearSearchObj(List<Student> studentList, int marks){
        for(int i = 0; i < studentList.size(); i++){
            if(studentList.get(i).getMarks() == marks){
                return i;
            }
        }
        return -1;
    }


    public static int binarySearch(List<Student> studentList, int marks){
        int l = 0;
        int h = studentList.size()-1;

        while (l <= h){
            int m = (l+h)/2;
            int middleValue = studentList.get(m).getMarks();
            if(middleValue == marks){
                return m;
            }
            if(marks > middleValue){
                l = m + 1;
            }
            if(marks < middleValue){
                h = m - 1 ;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(List.of(
                new Student("Saif", 78),
                new Student("Rahim", 65),
                new Student("Karim", 91),
                new Student("Nadia", 84),
                new Student("Ayesha", 72),
                new Student("Tanvir", 88),
                new Student("Mim", 59),
                new Student("Rafi", 95),
                new Student("Sadia", 67),
                new Student("Jamil", 80),
                new Student("Nusrat", 74),
                new Student("Hasan", 62),
                new Student("Tania", 89),
                new Student("Imran", 55),
                new Student("Faria", 93),
                new Student("Rashed", 70),
                new Student("Mehedi", 77),
                new Student("Priya", 85),
                new Student("Arif", 68),
                new Student("Shuvo", 97)
        ));


        int idxLin = linearSearchObj(studentList, 77);
        System.out.println("Lin Search");
        System.out.println(studentList.get(idxLin));
        studentList.sort( (a, b) -> a.getMarks() - b.getMarks());
        int idxBin = binarySearch(studentList, 77);
        System.out.println(studentList.get(idxBin));

    }

}

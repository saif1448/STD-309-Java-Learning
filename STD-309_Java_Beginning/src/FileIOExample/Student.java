package FileIOExample;

public class Student {

    private String name;
    private String grade;
    private String cgpa;

    public Student(String name, String grade, String cgpa) {
        this.name = name;
        this.grade = grade;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                ", cgpa='" + cgpa + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}

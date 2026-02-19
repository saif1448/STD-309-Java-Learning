package ClassExamples;

public class Student {

    private String studentId;
    private String name;
    private String grade;

    //setters

    public void setStudentId(String studentId){
        this.studentId = studentId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    // getters

    public String getStudentId(){
        return studentId;

    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}

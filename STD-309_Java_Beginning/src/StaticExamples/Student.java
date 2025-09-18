package StaticExamples;

public class Student {

    private static int count = 1;

    private String studentId;
    private String studentName;
    private String studentAddress;
//    private final String  instituteName = "ABC Institute";
    private final String  instituteName;

    public Student(String studentName, String studentAddress){

        this.studentId = "STD_ABC_"+count++;

        this.studentName = studentName;
        this.studentAddress = studentAddress;

        this.instituteName = "ABC Institute";
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", instituteName='" + instituteName + '\'' +
                '}';
    }
}

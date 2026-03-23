package MiscExamples.ObjectReferencingExample;

public class Student {

    private String name;
    private String id;
    private int marks;

    public Student(){
        name = "";
        id = "";
    }

    public Student(String name, String id){
        this.id = id;
        this.name = name;
    }

    public Student(String name, String id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
                ", id='" + id + '\'' +
                ", marks=" + marks +
                '}';
    }
}

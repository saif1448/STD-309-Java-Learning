package MiscExamples.ObjectReferencingExample;

public class Main {



    public static void updateStudentName(String newName, Student refStd){
        newName = newName + "UVW";
        System.out.println(newName);
        refStd.setName(newName);
    }


    public static void main(String[] args) {
        String str = "XYZ";
        Student s1 = new Student("ABCD", "123");

        System.out.println(s1);

        updateStudentName(str, s1);

        System.out.println(s1);

        System.out.println(str);

    }
}

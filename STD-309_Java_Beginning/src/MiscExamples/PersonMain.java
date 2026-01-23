package MiscExamples;

public class PersonMain {
    public static void main(String[] args) {
        Job job1 = new Job("Teacher", "ABC HighSchool");
        Job job2 = new Job("Doctor", "XYZ Hospital");

        // you are passing a reference of job1 object to tha constructor of Person p1
        Person p1 = new Person("ABCD", job1);

        job1.setCompany("PQR NewSchool");

        System.out.println("Person Job Company:" + p1.getJobCompany());


        int i = 20;

        i = 30;
    }
}

package MiscExamples;

public class Person {

    private String name;
    private Job job;

    public Person(String fullName, Job job1){
        name = fullName;
//        job = job1;
        job = new Job(job1.getJobTitle(), job1.getCompany());
    }

    public String getJobCompany(){
        return job.getCompany();
    }
}

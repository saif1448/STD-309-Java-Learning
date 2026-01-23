package MiscExamples;

public class Job {
    private String jobTitle;
    private String company;

    public Job(String jobTitle, String company) {
        this.jobTitle = jobTitle;
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}

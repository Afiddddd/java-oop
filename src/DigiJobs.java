public class DigiJobs {
    private String jobsId;
    private JobsPosition jobPosition;
    private String jobAddress;

    public DigiJobs(){

    }

    public String getJobId() {
        return jobsId;
    }

    public void setJobId(String jobId) {
        this.jobsId = jobId;
    }

    public JobsPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobsPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(String jobAddress) {
        this.jobAddress = jobAddress;
    }

    //Method print
    public void print(){
        String varJobId =this.jobsId;
        System.out.println("Job ID : " + getJobId() + ", Job Address : " + this.jobAddress + ", Job Position ID : " + jobPosition.getJobPositionId() + ", Job Position Name : " + jobPosition.getJobPositionName());
    }
}

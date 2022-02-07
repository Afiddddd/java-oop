import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
                ArrayList<DigiJobs> digiJobs = new ArrayList();
                Scanner sc = new Scanner(System.in);

                //Program input
                while (true){
                    System.out.println("==============DIGIJOBS==============");
                    System.out.println("Please choose following command : ");
                    System.out.println("[1] Add new job");
                    System.out.println("[2] Print all jobs");
                    System.out.println("[3] Delete a job");
                    System.out.println("[4] Exit");
                    String input = sc.nextLine();

                    //Program keluar jika input "4"
                    if (input.equalsIgnoreCase("4")){
                        System.exit(0);
                    }

                    String jobsId;
                    //Add data Job jika input "1"
                    if(input.equalsIgnoreCase("1")){
                        System.out.println("Please input new job using following format : [job_id],[job_address],[job_position_id],[job_position_name]");

                        jobsId = sc.nextLine();
                        String[] split = jobsId.split(",");

                        if (split.length == 4 ){
                            DigiJobs addJob = new DigiJobs();
                            addJob.setJobId(split[0]);
                            addJob.setJobAddress(split[1]);
                            JobsPosition jobPosition = new JobsPosition();
                            jobPosition.setJobPositionId(Integer.parseInt(split[2]));
                            jobPosition.setJobPositionName(split[3]);
                            addJob.setJobPosition(jobPosition);
                            //method untuk add ke colection
                            digiJobs.add(addJob);
                            System.out.println("Success add new job");

                            //Format tidak sesuai akan masuk ke block else
                        } else{
                            System.out.println("Wrong format!");
                        }

                        //Print jobs jika input "2"
                    } else if (input.equalsIgnoreCase("2")){
                        System.out.println("Your current jobs : ");
                        digiJobs.forEach((jobs) -> {
                            jobs.print();
                        });

                        //Delete data jobs jika input "3"
                    }else if (input.equalsIgnoreCase("3")){
                        System.out.println("Please input job id to delete : ");
                        jobsId = sc.nextLine();
                        //Pengecekan ID jobs
                        List<DigiJobs> collect =(List)digiJobs.stream().filter((job) -> {
                            return job.getJobId().equalsIgnoreCase(jobsId);
                        }).collect(Collectors.toList());

                        //ID tidak ada masuk block ini
                        if (collect.isEmpty()){
                            System.out.println("Job with job id " + jobsId + " not found");
                            //ID ada akan masuk ke block remove
                        } else {
                            digiJobs.removeAll(collect);
                            System.out.println("Success delete job with job id " +jobsId);
                        }
                    }
                }
            }
        }



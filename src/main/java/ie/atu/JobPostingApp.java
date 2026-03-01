package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

public class JobPostingApp {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<JobPosting> jobs = new ArrayList<>();

        JobPosting job = new JobPosting();

        System.out.print("Please enter Job ID: ");
        job.setJobId(scan.nextInt());

        System.out.print("Please enter Employer ID: ");
        job.setEmployerId(scan.nextInt());
        scan.nextLine();

        System.out.print("Please enter job title: ");
        job.setTitle(scan.nextLine());

        System.out.print("Please enter description: ");
        job.setDescription(scan.nextLine());

        System.out.print("Please enter required skills: ");
        job.setRequiredSkills(scan.nextLine());

        System.out.print("Please enter location: ");
        job.setLocation(scan.nextLine());

        System.out.print("Please enter salary range: ");
        job.setSalaryRange(scan.nextLine());

        jobs.add(job);

        // display saved jobs
        System.out.println("\nAll Job Postings:");
        for (JobPosting j : jobs) {
            System.out.println(j.getJobId() + " | " +
                    j.getTitle() + " | " +
                    j.getRequiredSkills() + " | " +
                    j.getLocation());
        }

        scan.close();
    }
}

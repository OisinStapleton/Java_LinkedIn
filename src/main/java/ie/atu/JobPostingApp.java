package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

public class JobPostingApp {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<JobPosting> jobs = new ArrayList<>();

        JobPosting job = new JobPosting();

        System.out.print("Enter Job ID: ");
        job.setJobId(scan.nextInt());

        System.out.print("Enter Employer ID: ");
        job.setEmployerId(scan.nextInt());
        scan.nextLine(); // clear buffer

        System.out.print("Enter Job Title: ");
        job.setTitle(scan.nextLine());

        System.out.print("Enter Description: ");
        job.setDescription(scan.nextLine());

        System.out.print("Enter Required Skills: ");
        job.setRequiredSkills(scan.nextLine());

        System.out.print("Enter Location: ");
        job.setLocation(scan.nextLine());

        System.out.print("Enter Salary Range: ");
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

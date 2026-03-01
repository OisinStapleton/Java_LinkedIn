package ie.atu;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployerApp {

    static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Employer> employers = new ArrayList<>();

        Employer employer = new Employer();

        System.out.print("Please enter employer ID: ");
        employer.setEmployerId(scan.nextInt());
        scan.nextLine();

        System.out.print("Please enter company name: ");
        employer.setCompanyName(scan.nextLine());

        System.out.print("Please enter industry name: ");
        employer.setIndustry(scan.nextLine());

        System.out.print("Please enter your location: ");
        employer.setLocation(scan.nextLine());

        System.out.print("Please enter your e-mail: ");
        employer.setContactEmail(scan.nextLine());

        System.out.print("Please enter your phone number: ");
        employer.setContactPhone(scan.nextLine());

        employers.add(employer);

        System.out.println("\nAll Employers:");
        for (Employer emp : employers) {
            System.out.println(emp.getEmployerId() + " | " +
                    emp.getCompanyName() + " | " +
                    emp.getIndustry());
        }

        scan.close();
    }
}

package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        EmploymentAgency agency = new EmploymentAgency();
        agency.addObserver(new JobSeeker("John"));
        agency.addObserver(new JobSeeker("Jane"));
        agency.notify(new JobPost("Something"));
    }
}

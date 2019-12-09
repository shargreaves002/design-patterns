package behavioral.observer;

import java.util.ArrayList;
import java.util.Observable;

public class EmploymentAgency extends Observable {
    ArrayList<JobPost> jobs = new ArrayList<>();

    public void notify(JobPost job){
        jobs.add(job);
        this.setChanged();
        this.notifyObservers(job);
    }
}

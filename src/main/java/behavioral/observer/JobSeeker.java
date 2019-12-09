package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class JobSeeker implements Observer {
    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        JobPost job = (JobPost) arg;
        System.out.println("Hi " + this.name + "! New job posted: " + job.getTitle());
    }
}

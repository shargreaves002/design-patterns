package creational.factory;

public class DevelopmentManager extends HiringManager {
    Interviewer makeInterviewer() {
        return new Developer();
    }
}

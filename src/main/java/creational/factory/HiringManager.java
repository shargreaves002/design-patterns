package creational.factory;

public abstract class HiringManager {
    abstract Interviewer makeInterviewer();

    void takeInterview(){
        Interviewer interviewer = this.makeInterviewer();
        interviewer.askQuestions();
    }
}

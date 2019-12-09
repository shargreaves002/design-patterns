package creational.factory;

public class MarketingManager extends HiringManager {
    Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}

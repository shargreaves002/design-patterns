package behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        Lion lion = new Lion();
        Dolphin dolphin = new Dolphin();
        Speak speak = new Speak();
        Jump jump = new Jump();
        monkey.accept(speak);
        monkey.accept(jump);
        lion.accept(speak);
        lion.accept(jump);
        dolphin.accept(speak);
        dolphin.accept(jump);
    }
}

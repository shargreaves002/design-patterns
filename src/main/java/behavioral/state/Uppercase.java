package behavioral.state;

public class Uppercase implements WritingState {
    @Override
    public void write(String words) {
        System.out.println(words.toUpperCase());
    }
}

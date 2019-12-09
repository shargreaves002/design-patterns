package behavioral.state;

public class Lowercase implements WritingState {
    @Override
    public void write(String words) {
        System.out.println(words.toLowerCase());
    }
}

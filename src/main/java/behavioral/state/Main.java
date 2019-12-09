package behavioral.state;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new DefaultText());
        editor.type("Some Words.");
        editor.setState(new Uppercase());
        editor.type("Some Words.");
        editor.setState(new Lowercase());
        editor.type("Some Words.");
    }
}

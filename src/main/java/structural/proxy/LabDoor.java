package structural.proxy;

public class LabDoor implements Door {
    public void open() {
        System.out.println("Opening lab door.");
    }

    public void close() {
        System.out.println("Closing lab door.");
    }
}

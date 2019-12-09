package creational.simpleFactory;

public class Main {
    public static void main(String[] args) {
        WoodenDoor door = DoorFactory.makeDoor(100, 200);

        System.out.println("Door 1:\nWidth: " + door.getWidth() + "\nHeight: " + door.getHeight());
        WoodenDoor door2 = DoorFactory.makeDoor(50, 100);
        System.out.println("Door 2:\nWidth: " + door2.getWidth() + "\nHeight: " + door2.getHeight());
    }
}

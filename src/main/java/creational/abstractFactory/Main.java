package creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
        Door door = woodenDoorFactory.makeDoor();
        DoorFittingExpert expert = woodenDoorFactory.makeFittingExpert();
        door.getDescription();
        expert.getDescription();

        IronDoorFactory ironDoorFactory = new IronDoorFactory();
        door = ironDoorFactory.makeDoor();
        expert = ironDoorFactory.makeFittingExpert();
        door.getDescription();
        expert.getDescription();
    }
}

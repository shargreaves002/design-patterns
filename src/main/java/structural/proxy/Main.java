package structural.proxy;

public class Main {
    public static void main(String[] args) {
        SecuredDoor door = new SecuredDoor(new LabDoor());
        door.open("invalid"); // fails
        door.open("$ecr@t"); // success
        door.close();
    }
}

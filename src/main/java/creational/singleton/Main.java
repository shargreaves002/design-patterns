package creational.singleton;

public class Main {
    public static void main(String[] args) {
        President president1 = President.getPresident();
        President president2 = President.getPresident();
        System.out.println(president1 == president2);
    }
}

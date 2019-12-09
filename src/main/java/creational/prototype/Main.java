package creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep original = new Sheep("Jolly");
        Sheep clone = original.clone();
        clone.setName("Dolly");
        System.out.println(original.getName() + ": " + original.getCategory());
        System.out.println(clone.getName() + ": " + clone.getCategory());
    }
}

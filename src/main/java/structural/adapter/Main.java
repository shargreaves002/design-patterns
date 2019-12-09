package structural.adapter;

public class Main {
    public static void main(String[] args) {
        WildDog dog = new WildDog();
        WildDogAdapter adapter = new WildDogAdapter(dog);

        Hunter hunter = new Hunter();
        hunter.hunt(adapter);
    }
}

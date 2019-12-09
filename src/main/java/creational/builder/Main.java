package creational.builder;

public class Main {
    public static void main(String[] args) {
        Burger burger = (new BurgerBuilder(5)).toggleCheese()
                                                    .toggleLettuce()
                                                    .toggleTomato()
                                                    .build();
    }
}

package creational.builder;

public class Burger {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean lettuce;
    private boolean tomato;

    Burger (BurgerBuilder builder){
        this.size = builder.getSize();
        this.cheese = builder.hasCheese();
        this.pepperoni = builder.hasPepperoni();
        this.lettuce = builder.hasLettuce();
        this.tomato = builder.hasTomato();
    }

    public int getSize() {
        return size;
    }

    public boolean hasCheese() {
        return cheese;
    }

    public boolean hasPepperoni() {
        return pepperoni;
    }

    public boolean hasLettuce() {
        return lettuce;
    }

    public boolean hasTomato() {
        return tomato;
    }
}

package creational.builder;

public class BurgerBuilder {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean lettuce;
    private boolean tomato;

    public BurgerBuilder(int size) {
        this.size = size;
    }

    public BurgerBuilder toggleCheese(){
        this.cheese = !this.cheese;
        return this;
    }

    public BurgerBuilder togglePepperoni(){
        this.pepperoni = !this.pepperoni;
        return this;
    }

    public BurgerBuilder toggleLettuce(){
        this.lettuce = !this.lettuce;
        return this;
    }

    public BurgerBuilder toggleTomato(){
        this.tomato = !this.tomato;
        return this;
    }

    public int getSize() {
        return this.size;
    }

    public boolean hasCheese() {
        return this.cheese;
    }

    public boolean hasPepperoni() {
        return this.pepperoni;
    }

    public boolean hasLettuce() {
        return this.lettuce;
    }

    public boolean hasTomato() {
        return this.tomato;
    }

    public Burger build() {
        return new Burger(this);
    }
}

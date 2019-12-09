package structural.decorator;

public class WhipCoffee implements Coffee {

    private Coffee coffee;

    public WhipCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    public double getCost() {
        return this.coffee.getCost() + 5;
    }

    public String getDescription() {
        return this.coffee.getDescription() + ", Whip";
    }
}

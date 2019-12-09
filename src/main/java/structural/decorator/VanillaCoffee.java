package structural.decorator;

public class VanillaCoffee implements Coffee {

    private Coffee coffee;

    public VanillaCoffee(Coffee coffee){
        this.coffee = coffee;
    }

    public double getCost() {
        return this.coffee.getCost() + 3;
    }

    public String getDescription() {
        return this.coffee.getDescription() + ", Vanilla";
    }
}

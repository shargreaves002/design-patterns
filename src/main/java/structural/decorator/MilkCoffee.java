package structural.decorator;

public class MilkCoffee implements Coffee {

    private Coffee coffee;

    public MilkCoffee (Coffee coffee){
        this.coffee = coffee;
    }

    public double getCost() {
        return this.coffee.getCost() + 2;
    }

    public String getDescription() {
        return this.coffee.getDescription() + ", Milk";
    }
}

package structural.decorator;

public class SimpleCoffee implements Coffee {
    public double getCost() {
        return 10;
    }

    public String getDescription() {
        return "Simple Coffee";
    }
}

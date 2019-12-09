package behavioral.template;

public class IosBuilder extends Builder {
    @Override
    public void test() {
        System.out.println("Running iPhone tests.");
    }

    @Override
    public void lint() {
        System.out.println("Linting iPhone code.");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling iPhone code.");
    }

    @Override
    public void deploy() {
        System.out.println("Deploying iPhone code.");
    }
}

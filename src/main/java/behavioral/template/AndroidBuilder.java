package behavioral.template;

public class AndroidBuilder extends Builder {
    @Override
    public void test() {
        System.out.println("Running android tests.");
    }

    @Override
    public void lint() {
        System.out.println("Linting the android code.");
    }

    @Override
    public void assemble() {
        System.out.println("Assembling the android code.");
    }

    @Override
    public void deploy() {
        System.out.println("Deploying the android code.");
    }
}

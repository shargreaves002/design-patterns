package behavioral.visitor;

public class Monkey implements Animal {
    @Override
    public void accept(AnimalOperation operation) {
        operation.visitMonkey(this);
    }

    void shout(){
        System.out.println("Oo oo aa aa!");
    }
}

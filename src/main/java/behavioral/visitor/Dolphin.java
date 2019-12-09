package behavioral.visitor;

public class Dolphin implements Animal {
    @Override
    public void accept(AnimalOperation operation) {
        operation.visitDolphin(this);
    }

    void speak(){
        System.out.println("Tuut tuttu tuutt!");
    }
}

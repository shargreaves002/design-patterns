package behavioral.template;

public abstract class Builder {
    public void build(){
        this.test();
        this.lint();
        this.assemble();
        this.deploy();
    }
    public abstract void test();
    public abstract void lint();
    public abstract void assemble();
    public abstract void deploy();
}

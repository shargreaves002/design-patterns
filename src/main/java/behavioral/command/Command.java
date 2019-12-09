package behavioral.command;

public interface Command {
    void execute();
    void undo();
    default void redo(){
        this.execute();
    }
}

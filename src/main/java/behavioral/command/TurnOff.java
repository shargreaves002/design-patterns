package behavioral.command;

public class TurnOff implements Command {
    private Bulb bulb;

    public TurnOff (Bulb bulb){
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        this.bulb.turnOff();
    }

    @Override
    public void undo() {
        this.bulb.turnOn();
    }
}

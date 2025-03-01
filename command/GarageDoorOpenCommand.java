package command;

class GarageDoor {
    public void up() {
        System.out.println("Garage door is open");
    }

    public void down() {
        System.out.println("Garage door is closed");
    }

    public void stop() {
        System.out.println("Garage door is stopped");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
}

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    public void undo() {
        garageDoor.down();
    }

}

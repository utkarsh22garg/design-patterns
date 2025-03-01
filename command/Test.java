package command;

public class Test {
    public static void main(String args[]) {
        // create a remote control
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // create a light
        Light light = new Light();

        // create a command for the light
        LightOnCommand lightOn = new LightOnCommand(light);

        // set the command for the remote
        remote.setCommand(lightOn);

        // press the button
        remote.buttonWasPressed();

        // undo the action
        remote.undo();

        // create a garage door
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
        remote.undo();
    }
}

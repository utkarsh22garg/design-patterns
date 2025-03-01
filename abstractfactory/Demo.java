package abstractfactory;

import abstractfactory.factory.GuiFactory;
import abstractfactory.factory.MacFactory;
import abstractfactory.factory.WindowsFactory;

public class Demo {
    public static void main(String args[]) {
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WindowsFactory();
        }

        Application app = new Application(factory);
        app.paint();
    }
}

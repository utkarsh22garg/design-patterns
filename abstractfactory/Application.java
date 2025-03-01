package abstractfactory;

import abstractfactory.button.Button;
import abstractfactory.checkbox.Checkbox;
import abstractfactory.factory.GuiFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.creatCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

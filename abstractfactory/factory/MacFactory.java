package abstractfactory.factory;

import abstractfactory.button.Button;
import abstractfactory.button.MacButton;
import abstractfactory.checkbox.Checkbox;
import abstractfactory.checkbox.MacCheckbox;

public class MacFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new MacCheckbox();
    }
}

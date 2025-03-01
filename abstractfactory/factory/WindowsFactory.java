package abstractfactory.factory;

import abstractfactory.button.Button;
import abstractfactory.button.WindowsButton;
import abstractfactory.checkbox.Checkbox;
import abstractfactory.checkbox.WindowsCheckbox;

public class WindowsFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox creatCheckbox() {
        return new WindowsCheckbox();
    }
}

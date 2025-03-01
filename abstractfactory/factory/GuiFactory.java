package abstractfactory.factory;

import abstractfactory.button.Button;
import abstractfactory.checkbox.Checkbox;

public interface GuiFactory {
    public Button createButton();

    public Checkbox creatCheckbox();
}
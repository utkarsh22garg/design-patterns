package abstractfactory.checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacCheckbox created");
    }
}

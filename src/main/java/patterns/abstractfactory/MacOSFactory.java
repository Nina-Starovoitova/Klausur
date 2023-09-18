package patterns.abstractfactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }

    @Override
    public RadioButton createRadioButton() {
        return new MacOSRadioButton();
    }
}

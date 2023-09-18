package patterns.abstractfactory;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public RadioButton createRadioButton() {
        return new WindowsRadioButton();
    }



}

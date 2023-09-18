package patterns.abstractfactory;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
         return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }

    @Override
    public RadioButton createRadioButton() {
        return new LinuxRadioButton();
    }
}

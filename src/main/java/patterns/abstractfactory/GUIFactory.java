package patterns.abstractfactory;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
    RadioButton createRadioButton();
}

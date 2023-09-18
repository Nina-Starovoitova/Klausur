package patterns.abstractfactory;

public class Application {
    private Button button;
    private Checkbox checkbox;
    private RadioButton radioButton;

    public Application(GUIFactory guiFactory) {
        checkbox = guiFactory.createCheckbox();
        button = guiFactory.createButton();
        radioButton = guiFactory.createRadioButton();
    }
    public void paint(){
        button.paint();
        checkbox.paint();
        radioButton.paint();
    }
}


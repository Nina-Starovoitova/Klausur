package patterns.abstractfactory;

public class WindowsRadioButton implements RadioButton{
    @Override
    public void paint() {
        System.out.println("You have created WindowsRadioButton.");
    }
}

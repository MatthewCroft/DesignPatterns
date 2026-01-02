package creational.abstractfactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("This is a Windows checkbox");
    }
}

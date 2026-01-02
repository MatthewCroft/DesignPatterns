package creational.abstractfactory;

public class MacCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("This is a Mac checkbox");
    }
}

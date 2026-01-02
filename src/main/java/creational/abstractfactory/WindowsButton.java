package creational.abstractfactory;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("This is a windows button rendering");
    }
}

package creational.abstractfactory;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("This is rendering a Mac button");
    }
}

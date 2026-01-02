package creational.abstractfactory;

/**
 * This is the example client that interacts with
 * the different UIFactory's
 */
public class Application {
    Button button;
    Checkbox checkbox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
}

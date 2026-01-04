package creational.abstractfactory;

interface Button {
    void render();
}

class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("This is a Mac button");
    }
}

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("This is a Windows Button");
    }
}

interface Checkbox {
    void toggle();
}

class MacCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("This is a Mac checkbox");
    }
}

class WindowsCheckbox implements Checkbox {
    @Override
    public void toggle() {
        System.out.println("This is a Windows checkbox");
    }
}

interface UIFactory {
   Button createButton();
   Checkbox createCheckbox();
}

class MacFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

class Application {
    Button button;
    Checkbox checkbox;
    public Application(UIFactory factory) {
       button = factory.createButton();
       checkbox = factory.createCheckbox();
    }
}
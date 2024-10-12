package io.github.brunogabriel.creational.abstractfactory;

import io.github.brunogabriel.creational.abstractfactory.buttons.Button;
import io.github.brunogabriel.creational.abstractfactory.buttons.Checkbox;
import io.github.brunogabriel.creational.abstractfactory.guifactory.GUIFactory;

public class AbstractFactoryApp {
    private final Button button;
    private final Checkbox checkbox;

    public AbstractFactoryApp(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

package io.github.brunogabriel.creational.abstractfactory.guifactory;

import io.github.brunogabriel.creational.abstractfactory.buttons.Button;
import io.github.brunogabriel.creational.abstractfactory.buttons.Checkbox;
import io.github.brunogabriel.creational.abstractfactory.buttons.MacOSButton;
import io.github.brunogabriel.creational.abstractfactory.buttons.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

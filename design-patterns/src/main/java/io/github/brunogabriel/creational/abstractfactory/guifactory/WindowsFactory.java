package io.github.brunogabriel.creational.abstractfactory.guifactory;

import io.github.brunogabriel.creational.abstractfactory.buttons.Button;
import io.github.brunogabriel.creational.abstractfactory.buttons.Checkbox;
import io.github.brunogabriel.creational.abstractfactory.buttons.WindowsButton;
import io.github.brunogabriel.creational.abstractfactory.buttons.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

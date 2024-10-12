package io.github.brunogabriel.creational.abstractfactory.guifactory;

import io.github.brunogabriel.creational.abstractfactory.buttons.Button;
import io.github.brunogabriel.creational.abstractfactory.buttons.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

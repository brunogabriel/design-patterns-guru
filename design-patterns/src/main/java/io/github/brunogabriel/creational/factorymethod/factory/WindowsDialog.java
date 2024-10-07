package io.github.brunogabriel.creational.factorymethod.factory;

import io.github.brunogabriel.creational.factorymethod.buttons.Button;
import io.github.brunogabriel.creational.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}

package io.github.brunogabriel.creational.factorymethod.factory;

import io.github.brunogabriel.creational.factorymethod.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}

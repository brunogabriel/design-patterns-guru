package io.github.brunogabriel.creational.factorymethod.factory;

import io.github.brunogabriel.creational.factorymethod.buttons.Button;
import io.github.brunogabriel.creational.factorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}

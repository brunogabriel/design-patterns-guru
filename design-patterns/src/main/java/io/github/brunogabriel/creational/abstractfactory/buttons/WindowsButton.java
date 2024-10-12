package io.github.brunogabriel.creational.abstractfactory.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}

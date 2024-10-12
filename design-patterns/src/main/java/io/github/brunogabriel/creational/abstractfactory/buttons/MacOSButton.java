package io.github.brunogabriel.creational.abstractfactory.buttons;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created MacOS button");
    }
}

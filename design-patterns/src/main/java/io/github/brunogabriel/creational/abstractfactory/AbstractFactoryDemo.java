package io.github.brunogabriel.creational.abstractfactory;

import io.github.brunogabriel.creational.abstractfactory.guifactory.GUIFactory;
import io.github.brunogabriel.creational.abstractfactory.guifactory.MacOSFactory;
import io.github.brunogabriel.creational.abstractfactory.guifactory.WindowsFactory;

public class AbstractFactoryDemo {
    private static AbstractFactoryApp configureApplication() {
        AbstractFactoryApp app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        app = new AbstractFactoryApp(factory);
        return app;
    }

    public static void main(String[] args) {
        AbstractFactoryApp app = configureApplication();
        app.paint();
    }
}

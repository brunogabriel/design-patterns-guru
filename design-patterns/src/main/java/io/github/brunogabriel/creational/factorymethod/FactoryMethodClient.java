package io.github.brunogabriel.creational.factorymethod;

import io.github.brunogabriel.creational.factorymethod.factory.Dialog;
import io.github.brunogabriel.creational.factorymethod.factory.HtmlDialog;
import io.github.brunogabriel.creational.factorymethod.factory.WindowsDialog;

import java.util.Arrays;
import java.util.List;

public class FactoryMethodClient {
    private static Dialog dialog;
    private static final List<String> defaultWindowsNames = Arrays.asList("Windows", "Linux");

    private static void configure() {
        String osName = System.getProperty("os.name");

        if (defaultWindowsNames.stream().anyMatch(osName::startsWith)) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }
}

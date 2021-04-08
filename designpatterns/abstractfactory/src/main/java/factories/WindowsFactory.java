package factories;

import components.buttons.Button;
import components.buttons.WindowsButton;
import components.checkboxes.Checkbox;
import components.checkboxes.WindowsCheckbox;

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

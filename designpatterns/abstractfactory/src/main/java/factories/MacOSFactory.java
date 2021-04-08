package factories;

import components.buttons.Button;
import components.buttons.MacOSButton;
import components.checkboxes.Checkbox;
import components.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

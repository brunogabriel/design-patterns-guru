package factory;

import components.Button;
import components.OSButton;

public class OSDialog extends Dialog {
    @Override
    public Button createButton() {
        return new OSButton();
    }
}

import factory.Dialog;
import factory.HtmlDialog;
import factory.OSDialog;

import java.util.Arrays;
import java.util.List;

public class DemoFactoryMethod {
    private static final List<String> osList = Arrays.asList("mac os x", "windows");
    private static Dialog dialog;

    public static void initialize() {
        boolean osFound = osList.stream().anyMatch(s -> s.contains(System.getProperty("os.name").toLowerCase()));
        if (osFound) {
            dialog = new OSDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    public static void render() {
        if (dialog != null) {
            dialog.renderWindow();
        }
    }

    public static void main(String[] args) {
        initialize();
        render();
    }
}

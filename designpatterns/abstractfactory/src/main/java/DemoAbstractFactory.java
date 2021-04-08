import app.Application;
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

public class DemoAbstractFactory {
    public static void main(String[] args) {
        GUIFactory factory;
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        Application app = new Application(factory);
        app.paint();
    }
}

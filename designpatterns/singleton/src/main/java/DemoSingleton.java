import components.Singleton;

public class DemoSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton secondSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.getValue());
        System.out.println(secondSingleton.getValue());
        System.out.println(singleton.getValue().equals(secondSingleton.getValue()));
    }
}

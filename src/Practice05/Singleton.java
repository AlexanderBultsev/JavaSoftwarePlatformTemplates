package Practice05;

public class Singleton {
    private Singleton() {}

    private static class SingletonHandler {
        public static final Singleton singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHandler.singleton;
    }
}

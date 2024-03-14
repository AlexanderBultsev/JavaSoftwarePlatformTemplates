public class SingletonSimple {

    private static final SingletonSimple singleton = new SingletonSimple();

    private SingletonSimple() {}

    public static SingletonSimple getInstance() {
        return singleton;
    }
}

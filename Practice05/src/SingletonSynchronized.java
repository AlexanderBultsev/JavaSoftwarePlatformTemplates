public class SingletonSynchronized {
    private static SingletonSynchronized singleton;
    private SingletonSynchronized() {}

    // Получить экземпляр класса может любой поток
    public static SingletonSynchronized getInstance() {
        if (singleton == null) {
            // В класс Singleton может попасть только один поток одновременно
            synchronized (SingletonSynchronized.class) {
                if (singleton == null) {
                    singleton = new SingletonSynchronized();
                }
            }
        }
        return singleton;
    }
}

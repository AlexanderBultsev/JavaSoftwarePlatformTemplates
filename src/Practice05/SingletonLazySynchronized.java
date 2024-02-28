package Practice05;

public class SingletonLazySynchronized {
    private static SingletonLazySynchronized singleton;

    private SingletonLazySynchronized() {}

    // Получить экземпляр класса может только один поток одновременно
    public static synchronized SingletonLazySynchronized getInstance() {
        if (singleton == null) {
            singleton = new SingletonLazySynchronized();
        }
        return singleton;
    }
}

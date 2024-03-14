public class Main {

    public static void main(String[] args) {
        NExecutorService executorService = new NExecutorService(2);
        for (int i = 0; i < 5; i++) {
            executorService.execute(() -> {
                System.out.println("Hello from thread " + Thread.currentThread().getName());
            });
        }
    }
}

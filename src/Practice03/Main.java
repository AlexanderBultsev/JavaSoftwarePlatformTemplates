package Practice03;

public class Main {
    public static void main(String[] args) {

        SynchronizedSet<String> set = new SynchronizedSet<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                set.add(String.valueOf(i));
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 10000; i < 20000; i++) {
                set.add(String.valueOf(i));
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Set size: " + set.size());


        LockedList<Integer> list = new LockedList<>();
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                list.add(i);
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 10000; i < 20000; i++) {
                list.add(i);
            }
        });
        thread3.start();
        thread4.start();
        try {
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("List size: " + list.size());
    }
}

package Practice01;

public class Main {
    public static void main(String[] args) {
        Log2Predicate<Integer> log2Predicate = new Log2Predicate<>();
        System.out.println(log2Predicate.test(9));
        System.out.println(log2Predicate.test(8));
        System.out.println(log2Predicate.test(1));
    }
}

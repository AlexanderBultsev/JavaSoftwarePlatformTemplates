package Practice01;

import java.util.function.Predicate;

public class Log2Predicate<T extends Integer> implements Predicate<T> {
    @Override
    public boolean test(Integer input) {
        Integer temp = input;
        while (temp % 2 == 0) {
            temp = temp >> 1;
        }
        return temp == 1;
    }
}

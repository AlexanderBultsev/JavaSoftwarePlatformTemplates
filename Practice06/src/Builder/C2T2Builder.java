package Builder;

import java.util.Arrays;
import java.util.List;

public class C2T2Builder implements Builder {
    @Override
    public List<Product> buildProductSet(int code) {
        return Arrays.asList(new Chair(code), new Chair(code), new Table(code), new Table(code));
    }
}

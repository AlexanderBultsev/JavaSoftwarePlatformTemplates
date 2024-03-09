package Practice06.Builder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProductSetBuilder implements Builder {
    public List<Product> buildProductSet(int code) {
        switch (code) {
            case 1:
                return new C4T1Builder().buildProductSet(11);
            case 2:
                return new C2T2Builder().buildProductSet(22);
            default:
                return Collections.emptyList();
        }
    }
}

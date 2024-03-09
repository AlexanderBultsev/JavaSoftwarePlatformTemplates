package Practice06.AbstractFactory;

import Practice06.FactoryMethod.Product;

public class Chair implements Product {
    int code;
    public Chair(int code) {
        this.code = code;
    }
    @Override
    public String getName() {
        return "Chair " + code;
    }
}

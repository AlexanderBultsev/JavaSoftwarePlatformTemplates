package AbstractFactory;

import FactoryMethod.Product;

public class Table implements Product {
    int code;
    public Table(int code) {
        this.code = code;
    }
    @Override
    public String getName() {
        return "Table " + code;
    }
}

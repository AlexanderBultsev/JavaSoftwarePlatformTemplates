package FactoryMethod;

public class ChairCreator extends Creator {

    @Override
    Product unit() {
        return new Chair();
    }
}

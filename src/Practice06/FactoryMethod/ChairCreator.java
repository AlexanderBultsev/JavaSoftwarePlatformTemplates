package Practice06.FactoryMethod;

public class ChairCreator extends Creator {

    @Override
    Product unit() {
        return new Chair();
    }
}

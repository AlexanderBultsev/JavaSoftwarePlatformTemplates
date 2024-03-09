package Practice06.FactoryMethod;

public class TableCreator extends Creator {

    @Override
    Product unit() {
        return new Table();
    }
}

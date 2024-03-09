package Practice06.AbstractFactory;

public class Factory592 implements AbstractFactory {

    @Override
    public Chair getChair() {
        return new Chair(592);
    }

    @Override
    public Table getTable() {
        return new Table(592);
    }
}

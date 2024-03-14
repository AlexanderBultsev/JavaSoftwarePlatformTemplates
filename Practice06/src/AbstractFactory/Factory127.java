package AbstractFactory;

public class Factory127 implements AbstractFactory {

    @Override
    public Chair getChair() {
        return new Chair(127);
    }

    @Override
    public Table getTable() {
        return new Table(127);
    }
}

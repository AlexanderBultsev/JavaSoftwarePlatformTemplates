package AbstractFactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new Factory127();
        Chair chair = factory.getChair();
        System.out.println(chair.getName());

        factory = new Factory592();
        Table table = factory.getTable();
        System.out.println(table.getName());
    }
}

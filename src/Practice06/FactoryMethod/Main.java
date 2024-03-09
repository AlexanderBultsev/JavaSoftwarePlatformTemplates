package Practice06.FactoryMethod;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product table = new TableCreator().unit();
        System.out.println(table.getName());

        List<Product> chairs = new ChairCreator().multiple(2);
        System.out.println(chairs.get(0).getName());
        System.out.println(chairs.get(1).getName());
    }
}

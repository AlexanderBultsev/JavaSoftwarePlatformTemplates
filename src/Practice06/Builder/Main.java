package Practice06.Builder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> productSet = new ProductSetBuilder().buildProductSet(1);
        for (Product p : productSet) {
            System.out.println(p.getName());
        }
        System.out.println("-------------------------");
        List<Product> productSet2 = new ProductSetBuilder().buildProductSet(2);
        for (Product p : productSet2) {
            System.out.println(p.getName());
        }
    }
}

package FactoryMethod;


import java.util.List;
import java.util.stream.Stream;

public abstract class Creator {

    List<Product> multiple(int count) {
        return Stream.generate(this::unit).limit(count).toList();
    }

    abstract Product unit();
}

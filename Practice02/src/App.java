import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class App {
    ArrayList<Human> humans;
    public App() {
        humans = new ArrayList<>();
        humans.add(new Human("John", "Foo", LocalDate.of(1990, 1, 12), 30, 70));
        humans.add(new Human("Eve", "Doe", LocalDate.of(1995, 2, 23), 23, 63));
        humans.add(new Human("Bob", "Ren", LocalDate.of(2000, 3, 22), 43, 50));
        humans.add(new Human("Alice", "Klee", LocalDate.of(2005, 2, 16), 15, 47));
        humans.add(new Human("Charlie", "Task", LocalDate.of(2010, 7, 17), 65, 30));
        humans.add(new Human("David", "Omen", LocalDate.of(2015, 6, 2), 7, 25));
        humans.add(new Human("Jane", "Poster", LocalDate.of(2020, 5, 3), 5, 12));
        humans.add(new Human("Frank", "Mun", LocalDate.of(2025, 4, 7), 12, 65));
    }

    public void run() {
        System.out.println("Beginning at " + LocalTime.now());
        System.out.println("-------------------\nFirst step is to sort by last name\n-----------------");
        humans.stream()
                .sorted(Comparator.comparing(Human::getFirstName).reversed())
                .forEach(System.out::println);
        System.out.println("-------------------\nSecond step is to filter by age\n-------------------");
        humans.stream()
                .sorted(Comparator.comparing(Human::getFirstName).reversed())
                .filter(human -> human.getAge() > 20)
                .forEach(System.out::println);
        System.out.println("-------------------\nThird step is to select first three humans\n-------------------");
        humans.stream()
                .sorted(Comparator.comparing(Human::getFirstName).reversed())
                .filter(human -> human.getAge() > 20)
                .limit(3)
                .forEach(System.out::println);
        System.out.println("-------------------\nFourth step is to concatenate names\n-------------------");
        Stream <Human> Hstream = humans.stream();
        Hstream.sorted(Comparator.comparing(Human::getFirstName).reversed())
                .filter(human -> human.getAge() > 20)
                .limit(3)
                .map(Human::getFirstName)
                .reduce((a, b) -> a + " " + b)
                .ifPresent(System.out::println);
        System.out.println("-------------------\nEnd at " + LocalTime.now() + "\n-------------------");
    }
}

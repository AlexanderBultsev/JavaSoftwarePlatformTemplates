package Practice02;

import java.time.LocalDate;

public class Human {
    String firstName;
    String lastName;
    LocalDate birthDate;
    int age;
    int weight;

    public Human(String firstName, String lastName, LocalDate birthDate, int age, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.age = age;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return firstName + " " +
                lastName + " " +
                birthDate + " " +
                "Age:" + age + " " +
                "Weight:" + weight;
    }
}

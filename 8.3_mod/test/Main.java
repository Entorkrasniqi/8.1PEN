import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Person {
    String name;
    int age;
    String city;

    Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // For printing
    @Override
    public String toString() {
        return name + ", " + age + " years old, from " + city;
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30, "New York"));
        people.add(new Person("Bob", 25, "Los Angeles"));
        people.add(new Person("Charlie", 35, "New York"));
        people.add(new Person("Diana", 22, "Chicago"));
        people.add(new Person("Ethan", 28, "New York"));

        // Step 2: Sort by age using a lambda and Comparator
        people.sort(Comparator.comparingInt(p -> p.age));

        System.out.println("Sorted by age (ascending):");
        for (Person person : people) {
            System.out.println(person);
        }

        // Step 3: Filter by city ("New York") using removeIf()
        people.removeIf(p -> !p.city.equals("New York"));

        System.out.println("\nFiltered list (only New York):");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

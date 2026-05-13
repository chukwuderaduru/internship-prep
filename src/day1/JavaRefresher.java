import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaRefresher {

    public static void main(String[] args) {
        // 1. Basic variable types
        String name = "Chuck";
        int age = 22;
        double gpa = 3.5;
        boolean isInternAtLabcorp = true;
        System.out.println(String.format("Name: %s, Age: %d, GPA: %.2f, Intern: %b",
                name, age, gpa, isInternAtLabcorp));

        // 2. ArrayList with for-each loop
        List<String> teammates = new ArrayList<>();
        teammates.add("Alice");
        teammates.add("Bob");
        teammates.add("Carol");
        teammates.add("Dan");
        teammates.add("Eve");
        System.out.println("\nTeam members:");
        for (String teammate : teammates) {
            System.out.println("- " + teammate);
        }

        // 3. HashMap with entrySet iteration
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Alice", 28);
        ages.put("Bob", 31);
        ages.put("Carol", 26);
        System.out.println("\nAges:");
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue());
        }

        // 4. Method call
        int sum = add(15, 27);
        System.out.println("\n15 + 27 = " + sum);

        // 5. Custom class
        Person p = new Person("Chuck", 22);
        System.out.println("\n" + p);

        // 6. Exception handling
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("\nCaught exception: " + e.getMessage());
        }
    }

    public static int add(int a, int b) {
        return a + b;
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person{name='%s', age=%d}", name, age);
    }
}



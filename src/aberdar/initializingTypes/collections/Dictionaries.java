package aberdar.initializingTypes.collections;

import java.util.HashMap;
import java.util.Map;

public class Dictionaries {

    public static void main(String[] args) {
        // Dictionaries <String, String>
        Map<String, String> languages = new HashMap<>();
        languages.put("ru", "russian");
        languages.put("en", "english");

        // Dictionaries <Int, String>
        Map<Integer, String> numbers = new HashMap<>() {{
                put(1, "one");
                put(2, "two");
        }};

        // Dictionaries <Int, Employee>
        Map<Integer, TypesCollections.Employee> employees = new HashMap<>();
        employees.put(1, new TypesCollections.Employee("Alexander", "Berdar"));
        employees.put(1, new TypesCollections.Employee("Alex", "Pavlov"));

        languages.forEach((key, value) -> System.out.println(key + ": " + value));
        numbers.forEach((key, value) -> System.out.println(key + ": " + value));
        employees.forEach((key, value) -> System.out.println(key + ": " + value.lastName));

        // Employee in file TypesCollections. This is example.
        class Employee {
            public String firstName;
            public String lastName;

            public Employee (String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
        }
    }
}

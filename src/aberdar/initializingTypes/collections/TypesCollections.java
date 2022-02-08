package aberdar.initializingTypes.collections;

import java.util.*;

public class TypesCollections {

    public static void main(String[] args) {
        // List to Double
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(19.6);

        // Stack to String
        Stack<String> stringStack = new Stack<>();
        stringStack.push("one");

        // Queue of Employee
        Queue<Employee> employeeQueue = new LinkedList<>();
        employeeQueue.add(new Employee("Alexander","Berdar"));

        System.out.println(doubleList.get(0));
        System.out.println(stringStack.peek());
        System.out.println(employeeQueue.peek());
    }

    static class Employee {
        public String firstName;
        public String lastName;

        public Employee(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
    }
}

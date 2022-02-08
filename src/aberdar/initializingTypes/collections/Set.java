package aberdar.initializingTypes.collections;

import java.util.Arrays;
import java.util.HashSet;

public class Set {

    public static void main(String[] args) {
        // First method
        HashSet<Integer> intSetOne = new HashSet<>(Arrays.asList(3, 4, 6, 7, 8));

        // Second method
        HashSet<Integer> intSetTwo = new HashSet<Integer>() {
            {
                add(1);
                add(2);
            }
        };

        System.out.println(intSetOne.contains(4)); // True
        System.out.println(intSetTwo.contains(3)); // False
    }
}

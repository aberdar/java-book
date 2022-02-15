package aberdar.lambdaFunctions;

import java.util.Arrays;

public class FunctionAsParameter {

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        Arrays.sort(numbers, (a, b) -> Integer.compare(b, a));

        System.out.println(Arrays.toString(numbers));
    }
}

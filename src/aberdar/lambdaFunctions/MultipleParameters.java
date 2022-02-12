package aberdar.lambdaFunctions;

import java.util.function.BiFunction;

public class MultipleParameters {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> avgFunction = (a, b) -> (a + b)/2;
        int avg = avgFunction.apply(3, 5);

        System.out.println("Avg is " + avg);
    }
}

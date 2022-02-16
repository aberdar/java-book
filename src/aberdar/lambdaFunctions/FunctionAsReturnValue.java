package aberdar.lambdaFunctions;

import java.util.function.BiFunction;

public class FunctionAsReturnValue {
    static BiFunction<Integer, Integer, Integer> makeSum() {
        return (a, b) -> a + b;
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> sumF = makeSum();
        int sum = sumF.apply(5, 6);

        System.out.println(sum);
    }
}

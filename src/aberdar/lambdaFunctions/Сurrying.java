package aberdar.lambdaFunctions;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class Сurrying {

    static Function<Integer, Function<Integer, Integer>> curry(BiFunction<Integer, Integer, Integer> f) {
        return a -> b -> f.apply(a, b);
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> avg = (a, b) -> (a + b)/2;
        Integer numberAvg = avg.apply(1, 3);

        Function<Integer, Integer> avgTwo = curry(avg).apply(1);
        int numberAvgTwo = avgTwo.apply(3);

        IntFunction<IntUnaryOperator> curriedAvg = a -> b -> (a + b)/2;
        IntUnaryOperator avgThree = curriedAvg.apply(3);
        int numberAvgThree = avgThree.applyAsInt(3);

        System.out.println(numberAvg + " " + numberAvgTwo + " " + numberAvgThree);
    }
}

package aberdar.lambdaFunctions;

import java.util.function.Consumer;

public class ChangingCapturedVariables {

    public static void main(String[] args) {
        int[] x = { 5 };

        Consumer<Integer> addY = y -> {x[0] += y; };
        addY.accept(6);

        System.out.println(x[0]);
    }
}

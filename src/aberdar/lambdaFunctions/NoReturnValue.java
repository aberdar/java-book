package aberdar.lambdaFunctions;

import java.util.function.Consumer;

public class NoReturnValue {

    public static void main(String[] args) {
        Consumer<Integer> addTwoAndPrint = a -> System.out.println(a + 2);
        addTwoAndPrint.accept(5);
    }
}

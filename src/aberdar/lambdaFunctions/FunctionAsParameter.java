package aberdar.lambdaFunctions;

import java.util.function.Consumer;

public class FunctionAsParameter {

    static void checkAndProcess(int number, Consumer<Integer> process) {
        if (number < 10) {
            process.accept(number);
        }
    }

    public static void main(String[] args) {
        Consumer<Integer> process = number -> System.out.println(number*10);
        checkAndProcess(5, process);
    }
}



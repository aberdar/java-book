package aberdar.lambdaFunctions;

import java.util.function.Function;

public class WithOneParameter {

    public static void main(String[] args) {
        Function<Integer, Integer> powOfTwo = (Integer power) -> (int)Math.pow(2, power);
        int powThree = powOfTwo.apply(3);

        Function<Integer, Integer> powOfThree = (Integer power) -> (int)Math.pow(3, power);
        int powTwo = powOfThree.apply(2);

        System.out.println(powThree); // 8
        System.out.println(powTwo); // 9
    }
}

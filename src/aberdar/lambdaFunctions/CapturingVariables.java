package aberdar.lambdaFunctions;

import java.util.function.Function;

public class CapturingVariables {

    static Function<Integer, Integer> makeWallet(Integer[] sum) {
        return pay -> sum[0] -= pay;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> payOne = makeWallet(new Integer[] {1000});
        Function<Integer, Integer> payTwo = makeWallet(new Integer[] {500});

        int balance = payOne.apply(50);
        System.out.println(balance);

        balance = payTwo.apply(100);
        System.out.println(balance);

        balance = payOne.apply(150);
        System.out.println(balance);
    }
}

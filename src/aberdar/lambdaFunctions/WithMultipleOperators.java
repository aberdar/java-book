package aberdar.lambdaFunctions;

import java.util.function.BiFunction;

class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class WithMultipleOperators {

    static BiFunction<Integer, Integer, Integer> makeSum() {
        return (a, b) -> (a + b);
    }

    public static void main(String[] args) {
        BiFunction<Point, Point, Double> getDistance = (p1, p2) -> {
            double d1 = Math.pow(p1.x - p2.x, 2);
            double d2 = Math.pow(p1.y - p2.y, 2);
            return Math.sqrt(d1+d2);
        };

        Point pointOne = new Point(0, 0);
        Point pointTwo = new Point(5, 5);

        double distance = getDistance.apply(pointOne, pointTwo);
        System.out.println(distance);
    }

}

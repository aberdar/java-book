package aberdar.initializingTypes.structures;

public class StructureWithoutConstructor {

    public static void main(String[] args) {
        Size size = new Size();
        size.width = 10;
        size.height = 12;

        Point point = new Point();
        point.left = 5;
        point.top = 7;

        Rectangle rectangle = new Rectangle();
        rectangle.point = point;
        rectangle.size = size;

        System.out.println(rectangle.point.left);
    }
}

class Size {
    public int width, height;
}

class Point {
    public int top, left;
}

class Rectangle {
    public Size size;
    public Point point;
}

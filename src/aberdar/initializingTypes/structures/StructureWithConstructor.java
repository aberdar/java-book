package aberdar.initializingTypes.structures;

public class StructureWithConstructor {

    public static void main(String[] args) {
        Sizes size = new Sizes(10, 11);
        Points point = new Points(5, 6);
        Rectangles rectangle = new Rectangles(size, point);

        System.out.println(rectangle.point.top);
    }
}

class Sizes {
    public int width, height;

    public Sizes (int width, int height) {
        this.width = width;
        this.height = height;
    }
}

class Points {
    public int top, left;

    public Points (int top, int left) {
        this.left = left;
        this.top = top;
    }
}

class Rectangles {
    public Sizes size;
    public Points point;

    public Rectangles(Sizes size, Points point) {
        this.size = size;
        this.point = point;
    }
}
